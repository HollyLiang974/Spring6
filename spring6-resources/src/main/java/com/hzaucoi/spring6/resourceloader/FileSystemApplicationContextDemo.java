package com.hzaucoi.spring6.resourceloader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class FileSystemApplicationContextDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext();
        Resource res = ctx.getResource("hzaucoi.txt");
        System.out.println(res.getFilename());
    }
}
