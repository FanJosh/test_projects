package com.dynamicProxy;

public class SmsServiceImpl implements SmsService {

    @Override
    public void send(String message) {
        System.out.println("send message:" + message);
    }

    @Override
    public void sendS(String[] messages) {
        int i = 0;
        for (String message:messages) {

            System.out.println("send message" + i +" :" + message);
            i++;
        }
    }
}
