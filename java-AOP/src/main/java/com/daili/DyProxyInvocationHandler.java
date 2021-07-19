package com.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 定义JDK动态代理类
 * 需实现 InvocationHandler 接口
 * JDK 动态代理有一个最致命的问题是其只能代理实现了接口的类。
 *
 */
public class DyProxyInvocationHandler implements InvocationHandler {
    // 目标类
    private Object target;

    /**
     *
     * @param target 目标类对象
     */
    public DyProxyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 动态生成的代理对象
     * @param method 目标类的方法 与代理类对象调用的方法相对应
     * @param args 当前方法的参数
     * @return
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法增强可以在这目标方法之前写一些逻辑
        System.out.println("吃东西前先做饭");

        Object invoke = method.invoke(target, args);

        //方法增强可以在这目标方法之后写一些逻辑
        System.out.println("吃完了要洗碗");
        return invoke;
    }
}
