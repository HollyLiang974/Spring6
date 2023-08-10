package com.hzaucoi.spring6.context;
//使用前缀指定访问策略
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class classpathDemo {

    public static void main(String[] args) {
        /*
         * 通过搜索文件系统路径下的xml文件创建ApplicationContext，
         * 但通过指定classpath:前缀强制搜索类加载路径
         * classpath:bean.xml
         * */
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:bean.xml");

//        classpath * :前缀提供了加载多个XML配置文件的能力，当使用classpath*:前缀来指定XML配置文件时，
//        系统将搜索类加载路径，找到所有与文件名匹配的文件，分别加载文件中的配置定义，最后合并成一个ApplicationContext。
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:bean.xml");
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:bean*.xml");
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:bean*.xml");

        System.out.println(ctx);
        Resource resource = ctx.getResource("hzaucoi.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}