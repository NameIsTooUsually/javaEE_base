package com.chenhao.exceptontest.test2;

public class CollectionTemo {
    public static void main(String[] args) {
        /*Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("dddd");
        System.out.println(collection);
        collection.removeIf(s-> "aaa".equals(s));
        //collection.clear();


        System.out.println(collection);*/

        Outer out = new Outer();

    }
}

class Outer {
    int a = 10;

    private class Inner {
        int a = 20;

        public void show() {
            System.out.println(Outer.this.a);
        }
    }

    Inner ii = new Inner();

    public void method() {
        Inner i = new Inner();
        i.show();

    }


}
