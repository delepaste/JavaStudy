package com.itheima.InnerClass;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        Outer.Inner o=new Outer(12).new Inner(10);
        System.out.println("Inner id  "+o.id);
        Outer.StaticInner a = new Outer.StaticInner(2);
        System.out.println("StaticInner id   "+a.id);

    }
}
