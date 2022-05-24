package core.basesyntax;

import java.util.Arrays;
import java.util.Random;

public class Application {
    static final int BALLS_NUMBER = 3;

    public static void main(String[] args) {
        final Lottery ball = new Lottery(new ColorSupplier(new Random()), new Random());
        Ball[] balls = new Ball[BALLS_NUMBER];
        for (int i = 0; i < BALLS_NUMBER; i++) {
            balls[i] = ball.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));
    }
}
