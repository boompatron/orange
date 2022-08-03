package com.example.orange.Repository;

import com.example.orange.entity.UserImg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserImageRepository extends JpaRepository<UserImg, Long> {
}
