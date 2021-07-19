package com.CGLIBProxy;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        AliSmsService proxy = (AliSmsService)CglibProxyFactory.getProxy(AliSmsService.class);
        proxy.send("java");

    }
}
