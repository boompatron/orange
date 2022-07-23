package com.example.orange.entity;

import com.example.orange.constant.Role;
import com.example.orange.repository.MemberRepository;
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
                        .email(email)
                        .picture(picture)
                        .role(Role.USER)
                        .build()
        );
        List<Member>memberList = memberRepository.findAll();
        Member member = memberList.get(0);
        assertThat(member.getEmail()).isEqualTo(email);
        assertThat(member.getName()).isEqualTo(name);
    }
}