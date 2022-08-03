package com.example.orange.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "item_image")
@NoArgsConstructor
public class ItemImg {
    @Id @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_path")
    private String filePath;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private Item item;
}
