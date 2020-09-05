package com.neo.singleTon;

// 双检锁: 既保证了线程安全，又比直接上锁提高了执行效率，还节省了内存空间
public class Single4 {

    private static Single4 instance;

    private Single4(){};

    public static Single4 getInstance(){
        if(instance == null){
            synchronized (Single4.class){
                if(instance == null){
                    instance = new Single4();
                }
            }
        }

        return instance;
    }
}
