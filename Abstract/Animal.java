package com.itheima.Abstract;

public abstract class Animal {
    public final void write(){
        System.out.println("在古老的森林里");
        System.out.println(aAnimal());
        System.out.println("愉快地生活着");
    }
    public abstract String aAnimal();
}
