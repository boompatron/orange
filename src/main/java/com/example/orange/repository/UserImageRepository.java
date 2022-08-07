package com.example.orange.repository;

import com.example.orange.entity.UserImg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserImageRepository extends JpaRepository<UserImg, Long> {
}
