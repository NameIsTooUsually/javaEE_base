package com.chenhao.test7;

interface Inter{
    void show();
}
class Outer {
    //补全代码
    /*public static Inter method() {
        return new Inter() {
            @Override
            public void show() {
                System.out.println("HelloWord");
            }
        };
    }*/
    public static Inter method() {
        return ()->System.out.println("HelloWord");
    }

}

class OuterDemo{
    public static void main(String[] args) {
        Outer.method().show(); // HelloWorld
    }
}
