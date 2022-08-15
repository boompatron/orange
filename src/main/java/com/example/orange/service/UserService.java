package com.example.orange.service;

import com.example.orange.dto.UserSaveRequestDto;
import com.example.orange.entity.User;
import com.example.orange.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Long saveUser(UserSaveRequestDto dto){return userRepository.save(dto.toEntity()).getId();}
}
