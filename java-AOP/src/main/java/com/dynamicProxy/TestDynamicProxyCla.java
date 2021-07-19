package com.dynamicProxy;

public class TestDynamicProxyCla {
    public static void main(String[] args) {
        SmsService proxyObject = (SmsService)JdkProxyFactory.getProxyObject(new SmsServiceImpl());
//        proxyObject.send("hello!!!");
        String[] mess = {"asd","qwd","qwd"};
        proxyObject.sendS(mess);
    }
}
