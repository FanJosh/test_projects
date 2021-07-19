package com.daili;

public class Test01 {
    public static void main(String[] args) {
        // 动态生成的代理对象
        Person dyProxyObject = (Person)DyProxyFactory.getDyProxyObject(new PersonAImpl());
        dyProxyObject.eat("aaa","asdasd");
    }
}
