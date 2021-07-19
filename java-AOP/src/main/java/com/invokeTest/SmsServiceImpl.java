package com.invokeTest;

/***
 * 目标类（被代理的类）
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public void send() {
        System.out.println("SmsServiceImpl send ......");
    }
}
