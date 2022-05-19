package core.basesyntax;

import java.util.Random;
public class Application {
    private static final int NUM_BALL = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[NUM_BALL];
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(random, supplier);
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
        for (Ball ball: balls) {
            System.out.println(ball);
        }

    }
}
