package com.nhnacademy.bookstoreeureka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookStoreEurekaApplicationTests {

    @Test
    public void mainMethodTest() {
        assertDoesNotThrow(() -> {
            BookStoreEurekaApplication.main(new String[]{});
        });
    }
}
