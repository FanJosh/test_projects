package com.CGLIBProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DebugMethodInterceptor implements MethodInterceptor {

    /**
     * @param o           ������Ķ�����Ҫ��ǿ�Ķ���
     * @param method      �����صķ�������Ҫ��ǿ�ķ�����
     * @param args        �������
     * @param methodProxy ���ڵ���ԭʼ����
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //���÷���֮ǰ�����ǿ�������Լ��Ĳ���
        System.out.println("before method " + method.getName());
        Object o1 = methodProxy.invokeSuper(o, objects);

        //���÷���֮������ͬ����������Լ��Ĳ���
        System.out.println("after method " + method.getName());
        return o1;
    }
}
