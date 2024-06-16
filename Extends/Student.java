package com.itheima.Extends;

public class Student extends People{
    public Student(int age, String name) {
        super(0, age, name);
    }
    public  Student(){
     this(12,"sa");
    }
    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("学生名为"+this.name+"，学生年龄为"+age);
    }

}
