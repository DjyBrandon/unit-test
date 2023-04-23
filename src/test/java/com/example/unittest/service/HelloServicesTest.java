package com.example.unittest.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @package: com.example.unittest.service
 * @Description:
 * @author: Brandon
 * @date: 2023/4/23 17:30
 **/
@SpringBootTest
public class HelloServicesTest {

    @Autowired
    private HelloServices helloServices;

    @Test
    void hello() {
        Assert.assertEquals("Hello Services !!!", helloServices.hello());
    }
}