package com.chenhao.test.test1;

import java.security.PrivateKey;

public class Test {
    public static void main(String[] args) {
        Tony tony = new Tony();
        tony.washHead();
    }


}

  class Tony {
    public void washHead() {
        System.out.println("托尼老师正在洗头");
    }
}
