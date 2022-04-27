package com.chenhao.test.test1;

public @interface Anno1 {
    public int a () default 25;
    public String name ();
    public Class aClass () default Anno2.class;
    public Season season ()default Season.AUTUMN;
    public int[] arr () default {1,2,3,4,5};
    public  Season[] arrSeason () default {Season.AUTUMN,Season.SPRING,Season.SUMMER,Season.WINTER};
}
