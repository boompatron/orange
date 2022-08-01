package com.example.orange.entity;

import com.example.orange.constant.ItemStatus;
import com.example.orange.constant.Negotiable;
import com.example.orange.service.ItemService;
import lombok.Builder;
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

    @Column(nullable = false)
    private String author;

    @Column(nullable = false, length = 50)
    private String itemName;

    @Column(name = "price", nullable = false)
    private int price;

    @Enumerated(EnumType.STRING)
    private ItemStatus itemStatus;

    @Lob
    @Column
    private String itemDetail;

    @Enumerated(EnumType.STRING)
    private Negotiable negotiable;

    @Builder
    public Item(String author, String itemName, int price, ItemStatus itemStatus,
                String itemDetail, Negotiable negotiable){
        this.author = author;
        this.itemDetail = itemDetail;
        this.itemName = itemName;
        this.price = price;
        this.itemStatus = itemStatus;
        this.negotiable = negotiable;
    }
    public void update(int price, ItemStatus itemStatus, String itemDetail, Negotiable negotiable){
        this.price = price;
        this.itemStatus = itemStatus;
        this.itemDetail = itemDetail;
        this.negotiable = negotiable;
    }
}
