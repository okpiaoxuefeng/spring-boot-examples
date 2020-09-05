package com.neo.singleTon;

//静态内部类: 效果类似双检锁，但实现更简单。但这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
public class Single1 {

    private static class LazyHolder{
        private static final Single1 INSTANCE = new Single1();
    }

    // 如果不是私有，则外部可以随时 new
    private Single1(){
        System.out.println("Single1 1---------------------------------------");
    };

    public static final Single1 getInstance(){
        return LazyHolder.INSTANCE;
    }

    public static void main(String[] args) {

        System.out.println("Single1 2---------------------------------------");
//        Single1.getInstance();
    }
}
