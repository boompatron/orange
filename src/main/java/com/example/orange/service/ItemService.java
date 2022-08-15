package com.example.orange.service;

import com.example.orange.repository.ItemImgRepository;
import com.example.orange.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
    // private final ItemImgService itemImgService;
    private final ItemImgRepository itemImgRepository;


}
