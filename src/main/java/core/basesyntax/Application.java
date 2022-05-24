package core.basesyntax;

import java.util.Arrays;
import java.util.Random;

public class Application {
    static final int BALLS_NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery(new ColorSupplier(new Random()), new Random());
        Ball[] balls = new Ball[BALLS_NUMBER];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = Blottery.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));
    }
}
