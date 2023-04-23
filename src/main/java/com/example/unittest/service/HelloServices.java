package com.example.unittest.service;

import org.springframework.stereotype.Service;

/**
 * @package: com.example.unittest.service
 * @Description:
 * @author: Brandon
 * @date: 2023/4/23 17:25
 **/
@Service
public class HelloServices {
    public String hello() {
        return "Hello Services !!!";
    }
}
