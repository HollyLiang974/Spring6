package com.hzaucoi.spring6.resourceloader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

//ClassPathXmlApplicationContext获取Resource实例
public class ClassPathXmlApplicationContextDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext();
//        通过ApplicationContext访问资源
//        ApplicationContext实例获取Resource实例时，
//        默认采用与ApplicationContext相同的资源访问策略
        Resource res = ctx.getResource("hzaucoi.txt");
        System.out.println(res.getFilename());
    }
}
