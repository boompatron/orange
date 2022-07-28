package com.example.orange.repository;

import com.example.orange.constant.ItemStatus;
import com.example.orange.constant.Negotiable;
import com.example.orange.entity.Item;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class ItemRepositoryTest {
    @Autowired
    ItemRepository itemRepository;

    @PersistenceContext
    EntityManager em;

    public void createItemLists(){
        for(int i = 0; i < 10; i++){
            itemRepository.save(
                    Item.builder()
                            .price(i)
                            .author("test_author " + i)
                            .itemDetail("test_detail " + i)
                            .itemName("test_name " + i)
                            .negotiable(Negotiable.No)
                            .itemStatus(ItemStatus.ON_SALE)
                            .build()
            );
        }
    }
    @Test
    @DisplayName("find with item name test")
    public void findByItemNameTest(){
        this.createItemLists();
        String name = "test_name 5";
        List<Item> itemList = itemRepository.findByItemName(name);

        assertThat(itemList.get(0).getItemName()).isEqualTo(name);
    }
}