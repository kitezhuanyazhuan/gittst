/**
 * Copyright (c) 2017, kbfoo. All rights reserved.
 */
package com;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author <a href="mailto:2881090362@qq.com">戴爽</a>
 * @version 1.0 17/5/3
 * @since 1.0
 */
public class ExecutorCase {

    private static Executor executor = Executors.newFixedThreadPool(10);

    static class Task implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        for (int i=0 ;i<20; i++){
            executor.execute(new Task());
        }
    }

}
