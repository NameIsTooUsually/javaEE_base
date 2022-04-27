package com.chenhao.test;

import java.io.*;
import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       /* ArrayList<User> arr = new ArrayList<>();
        arr.add(new User("杨过",29));
        arr.add(new User("张无忌",19));
        arr.add(new User("张桑峰",109));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("2022-4-10\\aaa.txt"));
        oos.writeObject(arr);
        oos.close();*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("2022-4-10\\aaa.txt"));
        while(true){
            try {
                ArrayList<User> arrayList = (ArrayList<User>)ois.readObject();
                for (User user : arrayList) {
                    System.out.println(user);
                }
            } catch (EOFException e) {
                break;
            }
        }
        ois.close();

    }
}
