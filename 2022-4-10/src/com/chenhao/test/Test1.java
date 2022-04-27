package com.chenhao.test;

import java.io.*;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("2022-4-10\\aaa.properties"));
        String s = br.readLine();
        br.close();
        String[] split = s.split(" ");
        System.out.println(Arrays.toString(split));
        int [] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);

        BufferedWriter bw = new BufferedWriter(new FileWriter("2022-4-10\\aaa.properties"));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+" ");
        }
        bw.close();


    }
}
