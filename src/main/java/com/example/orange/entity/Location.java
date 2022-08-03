package com.example.orange.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "location")
@Getter
@NoArgsConstructor
public class Location {
    @Id @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10)
    private String Do;

    @Column(length = 10)
    private String Gu_Si;

    @Column(length = 10)
    private String Lee_Dong;
}
