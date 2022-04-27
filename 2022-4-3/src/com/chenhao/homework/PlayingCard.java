package com.chenhao.homework;

//创建 一个扑克牌类
class PlayingCard {
    private String number;
    private String color;
    private int sizeOfCard;

    public PlayingCard() {
    }

    public PlayingCard(String number, String color, int sizeOfCard) {
        this.number = number;
        this.color = color;
        this.sizeOfCard = sizeOfCard;
    }

    public int getSizeOfCard() {
        return sizeOfCard;
    }

    public void setSizeOfCard(int sizeOfCard) {
        this.sizeOfCard = sizeOfCard;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "PlayingCard{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", sizeOfCard=" + sizeOfCard +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayingCard that = (PlayingCard) o;

        if (sizeOfCard != that.sizeOfCard) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        return color != null ? color.equals(that.color) : that.color == null;
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + sizeOfCard;
        return result;
    }

}
