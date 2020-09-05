package com.neo.singleTon;


// 懒汉式: 有线程安全和线程不安全两种写法，区别就是synchronized关键字。
public class Single2 {

    private static Single2 instance;

    private Single2(){};

    public static Single2 getInstance(){
        if(instance == null){
            instance = new Single2();
        }
        return instance;
    }
}
