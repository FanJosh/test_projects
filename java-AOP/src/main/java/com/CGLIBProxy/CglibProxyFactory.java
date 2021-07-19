package com.CGLIBProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * ��ȡ������Ĺ�����
 */
public class CglibProxyFactory {
    public static Object getProxy(Class<?> clazz){
        // ������̬������ǿ��
        Enhancer enhancer = new Enhancer();
        // �����������
        enhancer.setClassLoader(clazz.getClassLoader());

        //���ñ�������
        enhancer.setSuperclass(clazz);

        // ���÷���������
        enhancer.setCallback(new DebugMethodInterceptor());
        // ����������
        Object proxy = enhancer.create();


        return proxy;
    }
}
