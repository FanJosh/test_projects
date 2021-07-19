package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 定义一个 JDK 动态代理类
 */
public class DebugInvocationHandler implements InvocationHandler {
    //目标类
    private Object target;

    public DebugInvocationHandler(Object target){
        this.target = target;
    }

    /**
     * @param proxy 动态生成的代理类
     * @param method 与代理类对象调用的方法相对应
     * @param args 当前 method 方法的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        //调用方法之前，我们可以添加自己的操作
        System.out.println("before method " + method.getName());
        //反射机制  调用目标类类的method
        Object result = method.invoke(target, args);

        //调用方法之后，我们可以添加自己的操作
        System.out.println("after method " + method.getName());
        return result;
    }
}
