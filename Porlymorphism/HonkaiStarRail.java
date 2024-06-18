package com.itheima.Porlymorphism;

public class HonkaiStarRail extends MiHoYo{
    public int id;
    @Override
    public void slogn() {
        System.out.println("愿此行，终抵群星");
    }

    public HonkaiStarRail() {
    }

    public HonkaiStarRail(int id, int hp) {
        super(id, hp);
        this.id = 114514;
    }

}
