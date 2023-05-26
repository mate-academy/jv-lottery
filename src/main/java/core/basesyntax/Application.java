package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random(100);
        Lottery lottery = new Lottery(random, colorSupplier);
        Ball[] ballsArray = new Ball[3];

        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < ballsArray.length; i++) {
            ballsArray[i] = lottery.getRandomBall();
        }

        for (Ball ball : ballsArray) {
            System.out.println(ball);
        }
    }
}
