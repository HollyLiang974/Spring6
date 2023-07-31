package com.hazucoi.spring6.core;
//定义bean容器接口
public interface ApplicationContext {
    Object getBean(Class clazz);
}
