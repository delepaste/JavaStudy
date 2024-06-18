package com.itheima.Porlymorphism;

public class MiHoYo {
    public int id;
    private int hp;
    public void slogn(){
        System.out.println("技术宅拯救世界");
    }

    public MiHoYo() {
    }

    public MiHoYo(int id, int hp) {
        this.id = id;
        this.hp = hp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
