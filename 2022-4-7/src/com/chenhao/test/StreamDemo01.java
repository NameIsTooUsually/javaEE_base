package com.chenhao.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> mActorName = new ArrayList<>(List.of("张国立","张晋","刘烨","郑伊健","徐峥","王国宝"));
        ArrayList<String> wActorName = new ArrayList<>(List.of("郑爽","杨紫","刘烨","关晓彤","张天爱","杨幂","赵丽颖"));
        Stream<String> mActor = mActorName.stream().filter(name -> {
            return name.length() >= 3;
        }).limit(2);
        Stream<String> wActor = wActorName.stream().filter(name -> {
            return name.startsWith("杨");
        }).skip(1);

        Stream.concat(mActor,wActor).forEach(name->{
            System.out.println(new Actor(name));
        });
    }
}
class Actor{
    private String name;

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor(String name) {
        this.name = name;
    }

    public Actor() {
    }
}
