package com.itheima.System;

public class Test {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        int[] a={2,3,4,51,6,1,10,23920,12,-190};
        for (int Q =0;Q<100;Q++) {
            for (int z =0;z<100;z++) {
                for (int i = 0; i < a.length-1; i++) {
                    for (int j = 0; j < a.length-i-1; j++) {
                        if (a[j]>a[j+1]){
                            int tmp =a[j+1];
                            a[j+1]=a[j];
                            a[j]=tmp;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop-begin);//计算开始和结束的毫秒数值差
        System.exit(0);//退出程序
    }
}
