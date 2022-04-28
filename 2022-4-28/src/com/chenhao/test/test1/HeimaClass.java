package com.chenhao.test.test1;

public class HeimaClass {
    private String classNmme;
    private String classRoom;
    private String t_Head;
    private String t_teach;
    private int total;

    public void openClass(){
        System.out.println("开班");
    }
    public void xianxia(){
        System.out.println("线下上课");
    }
    public void xianshang(){
        System.out.println("线上直播课");
    }
    public void job(){
        System.out.println("100%全部高新就业");
    }

    public HeimaClass() {
    }

    public HeimaClass(String classNmme, String classRoom, String t_Head, String t_teach, int total) {
        this.classNmme = classNmme;
        this.classRoom = classRoom;
        this.t_Head = t_Head;
        this.t_teach = t_teach;
        this.total = total;
    }

    public String getClassNmme() {
        return classNmme;
    }

    public void setClassNmme(String classNmme) {
        this.classNmme = classNmme;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getT_Head() {
        return t_Head;
    }

    public void setT_Head(String t_Head) {
        this.t_Head = t_Head;
    }

    public String getT_teach() {
        return t_teach;
    }

    public void setT_teach(String t_teach) {
        this.t_teach = t_teach;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
