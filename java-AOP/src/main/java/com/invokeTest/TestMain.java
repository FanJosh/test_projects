package com.invokeTest;

public class TestMain {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsService smsProxy = new SmsProxy(smsService);
        smsProxy.send();
    }
}
