package core.basesyntax;

import lottery.Ball;
import lottery.Lottery;

public class Application {
    public static void main(String[] args) {
        Lottery newLottery = new Lottery();
        Ball[] ballsList = new Ball[3];
        for (int i = 0; i < 3; ++i) {
            ballsList[i] = newLottery.getRandomBall();
        }
        for (Ball ball : ballsList) {
            System.out.println(ball.toString());
        }
    }
}
