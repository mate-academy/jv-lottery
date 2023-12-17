package core.basesyntax;

import core.basesyntax.ball.Ball;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] arrayLottery = new Lottery[3];

        for (Lottery lottery : arrayLottery) {
            lottery = new Lottery();
            lottery.getRandomBall();
            System.out.println(lottery.getRandomBall());
        }
    }
}
