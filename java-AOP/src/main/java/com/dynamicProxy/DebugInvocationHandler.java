package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ����һ�� JDK ��̬������
 */
public class DebugInvocationHandler implements InvocationHandler {
    //Ŀ����
    private Object target;

    public DebugInvocationHandler(Object target){
        this.target = target;
    }

    /**
     * @param proxy ��̬���ɵĴ�����
     * @param method ������������õķ������Ӧ
     * @param args ��ǰ method �����Ĳ���
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        //���÷���֮ǰ�����ǿ�������Լ��Ĳ���
        System.out.println("before method " + method.getName());
        //�������  ����Ŀ�������method
        Object result = method.invoke(target, args);

        //���÷���֮�����ǿ�������Լ��Ĳ���
        System.out.println("after method " + method.getName());
        return result;
    }
}
