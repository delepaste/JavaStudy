package com.itheima.MyArrayList;

public class MyArrayList<T> {
    Object[] arr=new Object[100];
    public int size=0;
    boolean add(T data){
        arr[size++] = data;
        return true;
    }
    T get(int index){
        return (T)arr[index];
    }
}
