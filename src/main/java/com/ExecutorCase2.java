/**
 * Copyright (c) 2017, kbfoo. All rights reserved.
 */
package com;

import java.util.concurrent.*;

/**
 *
 * @author <a href="mailto:2881090362@qq.com">戴爽</a>
 * @version 1.0 17/5/4
 * @since 1.0
 */
public class ExecutorCase2 {

    private static ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        Future<String> future = executor.submit(new Task());
        System.out.println("do other things");
        try{
            String result = future.get();
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static class Task implements Callable<String>{
        public String call(){
            try{
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "this is future case";
        }
    }

}
