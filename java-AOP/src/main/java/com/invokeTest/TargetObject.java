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
         * ��ȡTargetObject���Class�����Ҵ���TargetObject��ʵ��
         */
        Class<?> targetClass = Class.forName("com.invokeTest.TargetObject");
        TargetObject targetObject = (TargetObject)targetClass.newInstance();

        /**
         * ��ȡ�����������ж���ķ���
         */
        Method[] declaredMethods = targetClass.getDeclaredMethods();
        for (Method me: declaredMethods) {
            System.out.println(me.getName());
        }

        /**
         * ��ȡָ������������
         */
        Method publicMethod = targetClass.getMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject,"java");

        /**
         * ��ȡָ���������Բ��������޸�
         */
        Field value = targetClass.getDeclaredField("value");
        //Ϊ�˶����еĲ��������޸�����ȡ����ȫ���
        value.setAccessible(true);
        value.set(targetObject,"privateMethod value");
        //����private ����
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        //Ϊ�˵���private��������ȡ����ȫ���
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
