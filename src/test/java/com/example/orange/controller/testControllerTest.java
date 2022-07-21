package com.example.orange.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
class testControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("first test & test for test")
    public void testMethod() throws Exception{
        String test = "test";
        mockMvc.perform(get("/test")).andExpect(status().isOk()).andExpect(content().string(test));
    }

    @Test
    @DisplayName("testing json")
    public void testDto() throws Exception{
        String email = "test@email.com";
        int idNum = 12345;

        mockMvc.perform(get("/test/dto").param("email", email).param("idNum", String.valueOf(idNum)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.email", is(email)))
                .andExpect(jsonPath("$.idNum", is(idNum)));
    }
}