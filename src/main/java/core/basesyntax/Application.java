package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static final int BALLS_COUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[BALLS_COUNT];
        for (int i = 0; i < BALLS_COUNT; i++) {
            balls[i] = lottery.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));
    }
}
