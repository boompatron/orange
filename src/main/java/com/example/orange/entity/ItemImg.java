package com.example.orange.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "item_img")
@Getter
public class ItemImg {
    @Id
    @Column(name = "itme_img_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imgName;
    private String imgUrl;
    private boolean isRepImg;

}
