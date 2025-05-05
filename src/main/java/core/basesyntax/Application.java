package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        Colors[] colors = Colors.values();
        ColorSupplier colorSupplier = new ColorSupplier(random, colors);
        Lottery lottery = new Lottery(random, colorSupplier);

        Ball b1 = lottery.getRandomBall();
        Ball b2 = lottery.getRandomBall();
        Ball b3 = lottery.getRandomBall();

        Ball[] ballArray = {b1, b2, b3};

        for (Ball ball : ballArray) {
            System.out.println(ball);
        }
    }
}
