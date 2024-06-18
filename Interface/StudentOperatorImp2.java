package com.itheima.Interface;

import java.util.ArrayList;

public class StudentOperatorImp2 implements StudentsOperator{

    @Override
    public void showInformation(ArrayList<Student> arr) {
        int count1 = 0,count2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("姓名:"+arr.get(i).name+"性别"+arr.get(i).sex+"年龄"+arr.get(i).age+"分数"+arr.get(i).score);
            if(arr.get(i).sex=='女') count2++;
            else count1++;
        }
        System.out.println("女生人数是"+count2);
        System.out.println("男生人数是"+count1);
    }

    @Override
    public void averageScore(ArrayList<Student> arr) {

    }
}
