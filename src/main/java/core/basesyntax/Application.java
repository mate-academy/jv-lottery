package core.basesyntax;

import core.basesyntax.classes.Ball;
import core.basesyntax.classes.Lottery;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        int numberOfBalls = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < numberOfBalls; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
