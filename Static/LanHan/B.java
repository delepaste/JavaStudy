package com.itheima.Static.LanHan;

public class B {
    public static B b;
    private B() {
        System.out.println("初始化B");
    }

    public static B getObject(){
        if(b == null){
            b = new B();
        }
        return b;
    }
}
