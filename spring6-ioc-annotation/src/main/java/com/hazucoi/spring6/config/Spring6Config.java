package com.hazucoi.spring6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//全注解开发就是不再使用spring配置文件了，写一个配置类来代替配置文件。
@Configuration
@ComponentScan("com.hazucoi.spring6")
public class Spring6Config {
}
