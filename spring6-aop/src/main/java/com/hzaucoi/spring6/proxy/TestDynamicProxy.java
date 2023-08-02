package com.hzaucoi.spring6.proxy;

/**
 * 测试动态代理
 */
public class TestDynamicProxy {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        Calculator proxy = (Calculator) new ProxyFactory(calculator).getProxy();
        proxy.add(1,2);

    }
}
