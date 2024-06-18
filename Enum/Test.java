package com.itheima.Enum;

public class Test {
    public static void main(String[] args) {
        Weeks w = Weeks.SATURDAY;
        switch (w){
            case SATURDAY:
                System.out.println("放假了");
                break;
            default:
                System.out.println("____");
        }
        for(Weeks w2:Weeks.values()){
            System.out.println(w2.ordinal()+" "+w2);
        }
        System.out.println(Weeks.valueOf("TUESDAY"));
        Weeks w3 = Weeks.valueOf("TUESDAY");
        System.out.println(w3.ordinal());


    }
}
