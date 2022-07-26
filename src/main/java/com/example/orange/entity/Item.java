package com.example.orange.entity;

import com.example.orange.constant.ItemStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Getter
@NoArgsConstructor
public class Item extends BaseEntity{
    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String itemName;

    @Column(name = "price", nullable = false)
    private int price;

    @Enumerated(EnumType.STRING)
    private ItemStatus itemStatus;

    @Lob
    @Column
    private String itemDetail;
}
