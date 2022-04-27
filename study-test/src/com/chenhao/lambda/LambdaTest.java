package com.chenhao.lambda;

public class LambdaTest {
    public static void main(String[] args) {
        goToPlay(new PlayGame() {
            @Override
            public void play() {
                System.out.println("当然是玩篮球了");
            }
        });

        goToPlay(new PlayGame() {
            @Override
            public void play() {
                System.out.println("还可以砍电影");
            }
        });

        goToPlay(()->{
            System.out.println("现在只能在家玩电脑");
        });

    }

    public static void goToPlay(PlayGame play){
        play.play();
    }
}

interface PlayGame{
    void play();
}
