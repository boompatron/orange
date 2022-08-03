package com.example.orange.Repository;

import com.example.orange.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<WishList, Long> {
}
