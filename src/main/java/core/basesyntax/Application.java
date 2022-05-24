package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int BALLS_NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery(new ColorSupplier(new Random()), new Random());
        Ball[] balls = new Ball[BALLS_NUMBER];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
