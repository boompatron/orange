package com.example.orange.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class TestResponseDtoTest {
    @Test
    public void assertionTest(){
        String email = "test@email.com";
        int idNum = 12345;

        TestResponseDto dto = new TestResponseDto(email, idNum);

        assertThat(dto.getEmail()).isEqualTo(email);
        assertThat(dto.getIdNum()).isEqualTo(idNum);
    }


}