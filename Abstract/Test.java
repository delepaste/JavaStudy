package com.itheima.Abstract;

public class Test {
    public static void main(String[] args) {
//        Animal animal = new Animal(); 抽象类无法直接创建对象只能作为父类让子类去继承
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        a1.write();
        a2.write();
        //模板方法设计模式
    }
}
