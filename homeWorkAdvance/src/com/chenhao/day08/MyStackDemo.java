package com.chenhao.day08;

import java.util.ArrayList;

/*
需求：使用ArrayList集合，模拟实现一个栈；要求：
1. 提供入栈、出栈和获取队列长度的功能；
 */
public class MyStackDemo {
    public static void main(String[] args) {

    }
}
class MyStack<T>{
    private ArrayList<T> arrayList = new ArrayList<>();
    //出栈
    public   Object outputStack() {
        //如果栈内元素个数为0.则返回null
        if(0==arrayList.size()){
            return null;
        }else{
            return arrayList.get(arrayList.size()-1);
        }
    }
    //入栈
    public void inputStack(T t) {
        arrayList.add(t);
    }
    //栈的长度
    public int stackSize(){
        return arrayList.size();
    }
}