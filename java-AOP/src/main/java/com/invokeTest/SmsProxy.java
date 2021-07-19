package com.invokeTest;

/***
 * 代理类
 */
public class SmsProxy implements SmsService {
    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    private final SmsService smsService;


    @Override
    public void send() {
        //调用方法之前，我们可以添加自己的操作
        System.out.println("before method send() ...");
        smsService.send();
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("after method send() ...");
    }
}
