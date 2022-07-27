package com.example.orange.dto;

import com.example.orange.constant.ItemStatus;
import com.example.orange.constant.Negotiable;
import com.example.orange.entity.Item;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;

@Getter
public class ItemResponseDto {
    private Long id;

    private String author;

    private String itemName;

    private int price;

    private ItemStatus itemStatus;

    private String itemDetail;

    private Negotiable negotiable;
    public ItemResponseDto(Item item){
        this.id = item.getId();
        this.author = item.getAuthor();
        this.itemName = item.getItemName();
        this.price = item.getPrice();
        this.itemStatus = item.getItemStatus();
        this.itemDetail = item.getItemDetail();
        this.negotiable = item.getNegotiable();
    }
}
