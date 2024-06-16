package com.itheima.Static.Block;

public class Student {
    public static int id;
    static{
        System.out.println("静态代码块正在运行");
        id=0;
        System.out.println("id已经初始化为为0");
        System.out.println(" ");
    }
    public int age;
    public Student(int age) {
        this.age = age;
        System.out.println("正在运行构造器");
    }
    {
        System.out.println("正在运行实例代码块");
        this.age=1;
    }
}
