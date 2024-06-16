package com.itheima.Static.User;

public class User {
    //        类方法中可以直接访问类的成员，不可以直接访问实例成员。
    public static void go(){
//      System.out.println(this.age);//不能出现this
//        System.out.println(age);//不能访问实例成员
    }
//        实例方法中既可以直接访问类成员，也可以直接访问实例成员。
//        实例方法中可以出现this关键字，类方法中不可以出现this关键字的。
    public int age;
    public static int userNumber=0;
    public static void printUserNumber(){
        System.out.println("一共有"+userNumber+"位使用者");
    }
    public User() {
        userNumber++;//访问了类成员
    }
}
