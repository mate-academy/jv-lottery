package core.basesyntax;

import java.util.Arrays;

public class Application {
    private static final int BOLLS_COUNT = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[BOLLS_COUNT];
        Lottery lottery = new Lottery();
        for (int i = 0; i < BOLLS_COUNT; i++) {
            balls[i] = lottery.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));
    }
}
