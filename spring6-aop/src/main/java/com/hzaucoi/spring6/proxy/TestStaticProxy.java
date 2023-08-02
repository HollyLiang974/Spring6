package com.hzaucoi.spring6.proxy;

/**
 * 测试静态代理
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        // 1. 创建目标对象
        Calculator target = new CalculatorImpl();

        // 2. 创建代理对象
        Calculator proxy = new CalculatorStaticProxy(target);

        // 3. 调用目标对象的方法
        int result = proxy.add(1, 2);
        System.out.println("result = " + result);

        result = proxy.sub(1, 2);
        System.out.println("result = " + result);

        result = proxy.mul(1, 2);
        System.out.println("result = " + result);

        result = proxy.div(1, 2);
        System.out.println("result = " + result);
    }
}
