package com.example.orange.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TestResponseDto {
    private final String email;
    private final Long IdCode;
}
