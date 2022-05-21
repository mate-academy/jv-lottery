package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
    Ball[] balls = new Ball[3];
    for(int i = 0; i < balls.length; i++) {
        Ball ball = lottery.getRandomBall();
        balls[i] = ball;
        System.out.println(i + 1);
        System.out.println(balls[i]);
    }
    }
}
