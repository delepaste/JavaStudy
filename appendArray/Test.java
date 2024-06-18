package com.itheima.appendArray;

public class Test {
    public static void main(String[] args) {
        Integer arr1[] = {11,22,33,44};
        String arr2[] = {"你好","谢谢","小笼包","再见"};
        System.out.println(appendArr(arr1));
        System.out.println(appendArr(arr2));
    }
    public static <T> StringBuilder  appendArr(T arr[]){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < arr.length-1; i++) {
            s.append(arr[i].toString());
            s.append(",");
        }
        s.append(arr[arr.length-1].toString());
        s.append("]");
        return s;
    }
}
