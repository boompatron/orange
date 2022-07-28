package com.example.orange.dto;

import com.example.orange.constant.ItemStatus;
import com.example.orange.constant.Negotiable;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ItemSaleRegisterRequestDto {
    private String author;
    private String itemName;
    private int price;
    private ItemStatus itemStatus;
    private String itemDetail;
    private Negotiable negotiable;

    @Builder
    public ItemSaleRegisterRequestDto(String author, String itemDetail, String itemName,
                                      int price, ItemStatus itemStatus, Negotiable negotiable){
        this.author = author;
        this.itemDetail = itemDetail;
        this.itemName = itemName;
        this.price = price;
        this.itemStatus = itemStatus;
        this.negotiable = negotiable;
    }
}
