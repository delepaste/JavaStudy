package com.itheima.Extends;

public class People {
    private int id;
    public int age;
    public String name;
    public void showInformation(){
        System.out.println("名为"+name+",年龄为"+age);
    }

    public People(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
