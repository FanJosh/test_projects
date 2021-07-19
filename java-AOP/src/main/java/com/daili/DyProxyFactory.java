package com.daili;

import java.lang.reflect.Proxy;

/**
 * 创建一个获取代理类的工厂类
 */
public class DyProxyFactory {
    public static Object getDyProxyObject(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces()
        ,new DyProxyInvocationHandler(target));
    }
}
