package com.itheima.InnerClass;

public class Outer {
    int id;
    public class Inner{
        int id;

        public Inner(int id) {
            this.id = id+Outer.this.id;
        }
    }

    public Outer(int id) {
        this.id = id;
    }
    public static class StaticInner{
        int id;

        public StaticInner(int id) {
            this.id = id;
        }
    }

}
