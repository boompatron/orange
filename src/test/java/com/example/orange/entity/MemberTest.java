package com.example.orange.entity;

import com.example.orange.constant.Role;
import com.example.orange.repository.MemberRepository;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class MemberTest {
    @Autowired
    MemberRepository memberRepository;

    @PersistenceContext
    EntityManager em;

//    @After
//    void cleanUp(){
//        memberRepository.deleteAll();
//    }

    @Test
    @DisplayName("Member repository test")
    // @WithMockUser(username = "test_name", roles = "USER")
    public void memberTest(){
        String name = "test_name";
        String email = "test@email.com";
        String picture = "test_picture";

        memberRepository.save(
                Member.builder()
                        .name(name)
                        .picture(picture)
                        .email(email)
                        .role(Role.USER)
                        .build()
        );
        List<Member>memberList = memberRepository.findAll();
        Member member = memberList.get(0);
        assertThat(member.getEmail()).isEqualTo(email);
        assertThat(member.getName()).isEqualTo(name);
    }

    @Test
    @DisplayName("Audit Test")
    public void BaseTimeEntityTest(){
        LocalDateTime now = LocalDateTime.of(2022, 7, 22, 0, 0, 0);
        memberRepository.save(Member.builder().name("name").picture("picture").email("email").role(Role.USER).build());

        List<Member> memberList = memberRepository.findAll();

        Member member = memberList.get(0);

        System.out.println(">>>>>>>> create Date" + member.getCreatedDate() + " , modify Date : " + member.getModifiedDate());

        assertThat(member.getCreatedDate()).isAfter(now);
        assertThat(member.getModifiedDate()).isAfter(now);
    }
}