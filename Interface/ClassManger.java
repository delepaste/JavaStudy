package com.itheima.Interface;

import java.util.ArrayList;

public class ClassManger {
    ArrayList<Student> arr = new ArrayList<>();
    StudentsOperator so = new StudentOperatorImp2();
    public ClassManger() {
        arr.add(new Student("小王",'男',18,90));
        arr.add(new Student("小李",'男',19,28));
        arr.add(new Student("小孙",'男',18,90));
        arr.add(new Student("小红",'女',17,99));
    }

    public void showInformation(){

        so.showInformation(arr);
    }
    public void averageScores(){
        so.averageScore(arr);
    }


}
