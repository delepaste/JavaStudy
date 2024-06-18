package com.itheima.MyArrayList;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> arr=new MyArrayList<>();
        arr.add("你好");
        arr.add("我好");
        arr.add("大家好");
        for(int i=0;i< arr.size;i++){
            System.out.println(arr.get(i));
        }
    }
}
