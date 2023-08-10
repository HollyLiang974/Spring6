package com.hzaucoi.spring6.resources;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;

/**
 * 访问类路径下资源
 */
public class ClassPathResourceDemo {
    public static void loadAndReadResource(String path) throws Exception {
        // 创建一个 Resource 对象
        ClassPathResource resource = null;
        resource = new ClassPathResource(path);
        // 获取资源名
        System.out.println(resource.getFilename());
        // 获取资源描述
        System.out.println(resource.getDescription());
        //获取资源内容
        InputStream in = resource.getInputStream();
        byte[] b = new byte[1024];
        while(in.read(b)!=-1) {
            System.out.println(new String(b));
        }
    }
    public static void main(String[] args) throws Exception {
        loadAndReadResource("hzaucoi.txt");
    }
}
