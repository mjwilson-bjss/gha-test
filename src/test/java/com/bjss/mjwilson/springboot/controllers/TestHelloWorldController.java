package com.bjss.mjwilson.springboot.controllers;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class TestHelloWorldController {

    @Autowired
    private MockMvc mvc;

    @Test
    public void shouldReturnHelloWorldText() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello?message=test")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Spring Boot hello world controller test")));
    }

    @Test
    public void shouldEncodeText() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello?message=<script>window.alert(this)</script>")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Spring Boot hello world controller %3Cscript%3Ewindow.alert%28this%29%3C%2Fscript%3E")));
    }

}
