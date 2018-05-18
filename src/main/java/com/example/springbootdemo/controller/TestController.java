package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cj34920
 * Date: 2018/05/18
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public  String hello(){
        return  "Hello World";
    }
}
