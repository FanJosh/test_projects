package com.invokeTest;

/***
 * ������
 */
public class SmsProxy implements SmsService {
    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    private final SmsService smsService;


    @Override
    public void send() {
        //���÷���֮ǰ�����ǿ�������Լ��Ĳ���
        System.out.println("before method send() ...");
        smsService.send();
        //���÷���֮������ͬ����������Լ��Ĳ���
        System.out.println("after method send() ...");
    }
}
