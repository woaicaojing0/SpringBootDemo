package com.example.springbootdemo;

import com.example.springbootdemo.controller.TestController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

    private MockMvc mockMvc;
    @Value("${book.name}")
    private String name;
    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new TestController()).build();
    }

    @Test
    public void contextLoads() {
        try {
            System.out.println("-------------------" + name);
            String resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/test").accept(MediaType.APPLICATION_JSON))
                    .andReturn().getResponse().getContentAsString();
            System.out.println(resultActions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
