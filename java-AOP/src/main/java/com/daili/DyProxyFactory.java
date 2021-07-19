package com.daili;

import java.lang.reflect.Proxy;

/**
 * ����һ����ȡ������Ĺ�����
 */
public class DyProxyFactory {
    public static Object getDyProxyObject(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces()
        ,new DyProxyInvocationHandler(target));
    }
}
