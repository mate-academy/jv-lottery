package core.basesyntax;

import java.util.Random;

public class Application {
    static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Random random = new Random();
        Lottery lottery = new Lottery(new ColorSupplier(random), random);
        Ball[] balls = new Ball[NUMBER_OF_BALLS];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
        for (Ball ball: balls) {
            System.out.println(ball);
        }
    }
}
