package com.itheima.AnonymousClass;

public class Test {
    public static void main(String[] args) {
        go(new Swiming() {
            @Override
            public void swim() {
                System.out.println("猫在游泳");
            }
        });
        go(new Swiming() {
            @Override
            public void swim() {
                System.out.println("狗也在游泳");
            }
        });
    }

    public static void go(Swiming s){
        System.out.println("=======game start========");
        s.swim();
    }
}
