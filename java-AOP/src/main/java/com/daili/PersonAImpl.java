package com.daili;

public class PersonAImpl implements Person {

    @Override
    public void eat(String f1,String f2) {
        System.out.println("PersonA ... eat();  f1:" + f1 + "f2: " + f2);
    }
}
