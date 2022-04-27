package com.chenhao.removeif;

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Iterator<String> it = list.iterator();
        list.removeIf((String s)->{return "aaa" == s;});

        System.out.println(list);
    }
}
