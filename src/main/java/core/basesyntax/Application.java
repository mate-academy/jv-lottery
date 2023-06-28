package core.basesyntax;

import lottery.Ball;
import lottery.Lottery;

public class Application {
    public static void main(String[] args) {
        Lottery newLottery = new Lottery();
        Ball[] ballsList = {
               newLottery.getRandomBall(),
               newLottery.getRandomBall(),
               newLottery.getRandomBall() };
        for (Ball ball : ballsList) {
            System.out.println(ball.toString());
        }
    }
}
