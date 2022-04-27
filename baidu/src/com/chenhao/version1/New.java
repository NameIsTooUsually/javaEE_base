package com.chenhao.version1;

public class New implements Comparable<New> {
    private int count;
    private String newMessage;
    private int like;
    private int comment;
    private int collection;

    public New() {
    }
    public New(int count,String newMessage){
        this.count = count;
        this.newMessage = newMessage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public New(String newMessage, int like, int comment, int collection) {
        this.newMessage = newMessage;
        this.like = like;
        this.comment = comment;
        this.collection = collection;
    }

    @Override
    public String toString() {
        return newMessage+"\t\t"+getTotalHot()+"万";
    }

    public New(String newMessage) {
        this.newMessage = newMessage;
    }

    public String getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }
    public int getTotalHot(){
        return  3 * like + 5 * comment + 8 * collection;
    }
    @Override
    public int compareTo(New n) {
        int result =  getTotalHot()-n.getTotalHot();
        result = result == 0 ? newMessage.compareTo(n.getNewMessage()):result;
        return -result;
    }
}


