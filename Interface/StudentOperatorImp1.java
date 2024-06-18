package com.itheima.Interface;

import java.util.ArrayList;

public class StudentOperatorImp1 implements StudentsOperator{
    @Override
    public void showInformation(ArrayList<Student> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("姓名:"+arr.get(i).name+"性别"+arr.get(i).sex+"年龄"+arr.get(i).age+"分数"+arr.get(i).score);
        }
    }

    @Override
    public void averageScore(ArrayList<Student> arr) {

    }
}
