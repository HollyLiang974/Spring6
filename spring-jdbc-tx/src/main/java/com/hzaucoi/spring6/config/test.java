package com.hzaucoi.spring6.config;

import com.hzaucoi.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController accountService = context.getBean("bookController", BookController.class);
        accountService.buyBook(1, 1);

    }
}
