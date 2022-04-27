package com.chenhao.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
需求：

- 按照斗地主的规则，完成洗牌发牌的动作。控制台输出如图：
- 具体规则：
  - 准备牌：组装54张扑克牌
  - 洗牌：54张牌顺序打乱
  - 摸牌：三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
  - 名牌：打印查看三人各自手中的牌（按照牌的大小排序）、底牌
 */
public class Test3 {
    public static void main(String[] args) {
        //先组装扑克牌
        //定义扑克牌的数字
        String[] numberArr = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //定义扑克牌的花色
        String[] colorArr = {"♦", "♣", "♥", "♠"};
        //创建一个ArrayList来存储扑克牌
        ArrayList<PlayingCard> playingCardArr = new ArrayList<>();
        //每张牌都四种花色，用两层循环来组装

        for (int i = 0, count = 0; i < numberArr.length; i++) {

            for (int j = 0; j < colorArr.length; j++) {
                PlayingCard card = new PlayingCard(numberArr[i], colorArr[j], count);
                playingCardArr.add(card);
                count++;
            }
        }
        //组装大小王
        PlayingCard big = new PlayingCard("大", "王", 53);
        PlayingCard small = new PlayingCard("小", "王", 52);
        playingCardArr.add(big);
        playingCardArr.add(small);

        //洗牌
        Collections.shuffle(playingCardArr);

        //创建三位玩家 以及底牌
        ArrayList<PlayingCard> player1 = new ArrayList<>();
        ArrayList<PlayingCard> player2 = new ArrayList<>();
        ArrayList<PlayingCard> player3 = new ArrayList<>();
        ArrayList<PlayingCard> cards = new ArrayList<>();

        //发牌
        int count = 0;
        while (count < 53) {
            if (count > 50) {
                //最后三张作为底牌
                cards.add(playingCardArr.get(count + 0));
                cards.add(playingCardArr.get(count + 1));
                cards.add(playingCardArr.get(count + 2));
                count += 3;
            } else {
                //分别为三个玩家发牌
                player1.add(playingCardArr.get(count + 0));
                player2.add(playingCardArr.get(count + 1));
                player3.add(playingCardArr.get(count + 2));
                count += 3;
            }
        }

        //打印玩家手牌
        print(player1, "令狐冲");
        print(player2, "石破天");
        print(player3, "鸠摩智");
        print(cards, "底牌");

    }

    public static void print(ArrayList<PlayingCard> player, String name) {
        player.sort(new Comparator<PlayingCard>() {
            @Override
            public int compare(PlayingCard o1, PlayingCard o2) {
                int result = o1.getSizeOfCard() - o2.getSizeOfCard();

                return -result;
            }
        });

        System.out.print(name + ":[");
        for (int i = 0; i < player.size(); i++) {
            PlayingCard tempCard = player.get(i);
            if (player.size() - 1 == i) {
                System.out.print(tempCard.getNumber() + tempCard.getColor() + "]");
            } else {
                System.out.print(tempCard.getNumber() + tempCard.getColor() + ", ");
            }
        }
        System.out.println();
    }

}

