package com.example.orange.service;

import com.example.orange.dto.ItemSaleRegisterRequestDto;
import com.example.orange.entity.Item;
import com.example.orange.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ItemService {
    private final ItemRepository itemRepository;

    @Transactional
    public Long save(ItemSaleRegisterRequestDto requestDto){
        return itemRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, ItemSaleRegisterRequestDto requestDto){
        Item item = itemRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("item not found, id : " + id));
        item.update(requestDto.getPrice(), requestDto.getItemStatus(), requestDto.getItemDetail(),requestDto.getNegotiable());
        return id;
    }
}
