package com.neo.singleTon;

// 饿汉式; 好处是没有线程安全的问题，坏处是浪费内存空间
public class Single3 {
    private static Single3 instance = new Single3();

    private Single3(){
        System.out.println("Single3 ------------------------");
    };

    public static Single3 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("Single3 2--------------------------");
    }
}
