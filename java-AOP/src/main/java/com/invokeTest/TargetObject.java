package com.invokeTest;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;

public class TargetObject {

    private String value;

    public TargetObject() {
        value = "TargetObject";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }

}

class Main{
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        /**
         * 获取TargetObject类的Class对象并且创建TargetObject类实例
         */
        Class<?> targetClass = Class.forName("com.invokeTest.TargetObject");
        TargetObject targetObject = (TargetObject)targetClass.newInstance();

        /**
         * 获取所有类中所有定义的方法
         */
        Method[] declaredMethods = targetClass.getDeclaredMethods();
        for (Method me: declaredMethods) {
            System.out.println(me.getName());
        }

        /**
         * 获取指定方法并调用
         */
        Method publicMethod = targetClass.getMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject,"java");

        /**
         * 获取指定参数并对参数进行修改
         */
        Field value = targetClass.getDeclaredField("value");
        //为了对类中的参数进行修改我们取消安全检查
        value.setAccessible(true);
        value.set(targetObject,"privateMethod value");
        //调用private 方法
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        //为了调用private方法我们取消安全检查
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);

        File f =new File(targetObject.getClass().getResource("").getPath());
        System.out.println(f);

        URL resource = targetObject.getClass().getClassLoader().getResource("");
        System.out.println(resource);
//        System.out.println(System.getProperty("java.class.path"));


        InterfaceClas1 interfaceClas1 = new InterfaceClas1Impl();
        interfaceClas1.method1();
    }

}
