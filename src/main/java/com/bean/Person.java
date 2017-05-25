/**
 * Copyright (c) 2017, kbfoo. All rights reserved.
 */
package com.bean;

/**
 *
 * @author <a href="mailto:2881090362@qq.com">戴爽</a>
 * @version 1.0 17/4/21
 * @since 1.0
 */
public class Person {

    private String name;

    private int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void foo(String ttt){
        System.out.println("==============:"+ttt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
