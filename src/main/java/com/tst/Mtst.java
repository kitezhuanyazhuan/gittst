/**
 * Copyright (c) 2017, kbfoo. All rights reserved.
 */
package com.tst;

import com.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author <a href="mailto:2881090362@qq.com">戴爽</a>
 * @version 1.0 17/3/10
 * @since 1.0
 */
public class Mtst {

    public static void main(String[] args) throws Exception {

        /**
         * java.util.Collection;
         * list
         * set
         * queuq
         */
        //System.out.println("hello workd");

        Class clazz = Class.forName("com.bean.Person");

        Constructor constructor1 = clazz.getConstructor();

        Constructor constructor2 = clazz.getConstructor(String.class,int.class);

        Object obj = constructor1.newInstance();

        if(obj instanceof Person){
            Person p = (Person) obj;
            p.setAge(1);
            p.setName("tt");
            System.out.println(p.getAge()+";"+p.getName());
        }

        Method fooMethod = clazz.getMethod("foo",String.class);

        fooMethod.invoke(obj,"haha");

        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(obj,"Shi Ta");
        System.out.println(field.get(obj));
    }
}
