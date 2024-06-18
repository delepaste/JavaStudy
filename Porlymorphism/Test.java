package com.itheima.Porlymorphism;

public class Test {
    public static void main(String[] args) {
        MiHoYo game1 = new GenshinImpact(10,100);
        MiHoYo game2 = new HonkaiStarRail(10,100);
        game1.slogn();//行为多态
        game2.slogn();
        System.out.println(game1.id);//变量不能多态捏
        System.out.println(game2.id);
//        game1.run();多态的实例，无法使用该类的独有方法
    }
}
