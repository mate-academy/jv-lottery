package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static final int NUMBER = 3;
    private static final Lottery lottery = new Lottery();

    public static void main(String[] args) {
        Ball[] balls = new Ball[NUMBER];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));
    }
}
