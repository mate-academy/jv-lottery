package core.basesyntax;

import lottery.Ball;
import lottery.Lottery;

public class Application {
    public static void main(String[] args) {
        Lottery newLottery = new Lottery();
        Ball[] ballsList = new Ball[3];

        for (Ball ball : ballsList) {
            ball = newLottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
