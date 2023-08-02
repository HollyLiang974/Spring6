package com.hzaucoi.spring6.aop.anno;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorTest {

    @Test
    public void testAdd() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = ac.getBean(Calculator.class);
        int add = calculator.add(1, 1);
    }
}
