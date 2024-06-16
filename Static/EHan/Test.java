package com.itheima.Static.EHan;

public class Test {
    public static void main(String[] args) {
        A a =A.getObject();
        a.setId(12);
        System.out.println(a.getId());
//        A a2 = new A();//无法使用构造器
        A a2 = A.getObject();
        System.out.println(a2.getId());
    }
}
