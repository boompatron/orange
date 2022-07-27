package com.example.orange.entity;

import com.example.orange.constant.ItemStatus;
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

    @Column(nullable = false, length = 50)
    private String itemName;

    @Column(name = "price", nullable = false)
    private int price;

    @Enumerated(EnumType.STRING)
    private ItemStatus itemStatus;

    @Lob
    @Column
    private String itemDetail;

    @Column
    private boolean negotiable;

    @Builder
    public Item(String itemName, int price, ItemStatus itemStatus, String itemDetail, boolean negotiable){
        this.itemDetail = itemDetail;
        this.itemName = itemName;
        this.price = price;
        this.itemStatus = itemStatus;
        this.negotiable = negotiable;
    }

}
