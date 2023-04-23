package com.example.unittest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UnitTestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void hello() {
        System.out.println("Hello World !!!");
    }

}
