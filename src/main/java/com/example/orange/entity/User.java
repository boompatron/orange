package com.example.orange.entity;

import com.example.orange.constant.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user") @Getter
@NoArgsConstructor
public class User extends BaseTimeEntity{
    @Id @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column
    private String username;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column
    private String name;

    @Column
    private String phone_number;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private Location location;

    @Builder
    public User(String email, String password, String username, Role role, String name, String phone_number
            , Location location){
        this.email = email;
        this.password = password;
        this.username = username;
        this.role = role;
        this.name = name;
        this.phone_number = phone_number;
        this.location = location;
    }
}
