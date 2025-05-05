package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Lottery lottery = new Lottery(colorSupplier, random);
        Ball[] balls = new Ball[NUMBER_OF_BALLS];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
