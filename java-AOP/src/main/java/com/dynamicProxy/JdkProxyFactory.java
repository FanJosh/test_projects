package com.dynamicProxy;

import java.lang.reflect.Proxy;

// ��ȡ�������Ĺ�����
public class JdkProxyFactory {
    public static Object getProxyObject(Object target){

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target));
    }
}
