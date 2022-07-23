package com.example.orange.entity;

import com.example.orange.constant.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.IdentityHashMap;

@Entity
@Table(name = "member")
@Getter
@NoArgsConstructor
public class Member extends BaseEntity {
    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Role role;

    @Column
    private String picture;

    @Builder
    public Member(String name, String email, String picture, Role role){
        this.email = email;
        this.name = name;
        this.picture = picture;
        this.role = role;
    }
}
