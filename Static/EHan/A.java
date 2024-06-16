package com.itheima.Static.EHan;

public class A {
    //所谓饿汉式单例，即在使用前就创建好了对象
    public static A a = new A();
    //私有化构造器
    private A(){}

    //返回对象的方法
    public static A getObject(){
        return a;
    }
    private int id;

    public static A getA() {
        return a;
    }

    public static void setA(A a) {
        A.a = a;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
