package com.itheima.Porlymorphism;

public class GenshinImpact extends MiHoYo{
    public int id;
    @Override
    public void slogn() {
        System.out.println("异世相遇");
    }

    public GenshinImpact() {
        this(0,0);
        System.out.println("原神，启动！");
    }

    public GenshinImpact(int id, int hp) {
        super(id,hp);
        this.id = super.id*100086;
    }
    public void run(){
        System.out.println("原神，启动！");
    }
}
