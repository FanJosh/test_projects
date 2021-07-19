package com.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ����JDK��̬������
 * ��ʵ�� InvocationHandler �ӿ�
 * JDK ��̬������һ������������������ֻ�ܴ���ʵ���˽ӿڵ��ࡣ
 *
 */
public class DyProxyInvocationHandler implements InvocationHandler {
    // Ŀ����
    private Object target;

    /**
     *
     * @param target Ŀ�������
     */
    public DyProxyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy ��̬���ɵĴ������
     * @param method Ŀ����ķ��� ������������õķ������Ӧ
     * @param args ��ǰ�����Ĳ���
     * @return
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //������ǿ��������Ŀ�귽��֮ǰдһЩ�߼�
        System.out.println("�Զ���ǰ������");

        Object invoke = method.invoke(target, args);

        //������ǿ��������Ŀ�귽��֮��дһЩ�߼�
        System.out.println("������Ҫϴ��");
        return invoke;
    }
}
