package com.example.orange.dto;

import com.example.orange.constant.ItemStatus;
import com.example.orange.constant.Negotiable;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;

@Getter
@NoArgsConstructor
public class ItemRequestDto {
    private String author;
    private String itemName;
    private int price;
    private ItemStatus itemStatus;
    private String itemDetail;
    private Negotiable negotiable;

    @Builder
    public ItemRequestDto(String author, String itemDetail, String itemName,
                           int price, ItemStatus itemStatus, Negotiable negotiable){
        this.author = author;
        this.itemDetail = itemDetail;
        this.itemName = itemName;
        this.price = price;
        this.itemStatus = itemStatus;
        this.negotiable = negotiable;
    }
}
