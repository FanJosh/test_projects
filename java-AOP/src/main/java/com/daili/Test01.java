package com.daili;

public class Test01 {
    public static void main(String[] args) {
        // ��̬���ɵĴ������
        Person dyProxyObject = (Person)DyProxyFactory.getDyProxyObject(new PersonAImpl());
        dyProxyObject.eat("aaa","asdasd");
    }
}
