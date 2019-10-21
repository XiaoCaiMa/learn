package com.xiaocaima.juc;

public class T0001 {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("Hello");
        }).start();
    }
}
