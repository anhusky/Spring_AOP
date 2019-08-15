package com.uu.a_proxy.static_proxy;

/**
 * @author liuph
 * @desc
 * @date 2019/08/14 23:15
 */
public class StaticTest {
    public static void main(String[] args) {

        // 目标对象
        UserServiceImpl targetService = new UserServiceImpl();

        // 代理对象，把目标对象传给代理对象，建立代理对象
        UserServiceImplProxy userServiceImplProxy = new UserServiceImplProxy(targetService);

        userServiceImplProxy.eat(); // 执行的是代理的方法
    }
}
