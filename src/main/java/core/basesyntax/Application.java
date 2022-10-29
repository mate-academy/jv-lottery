package core.basesyntax;

import java.util.Arrays;

public class Application {

    private static final int NUMBER_OF_BALLS = 3;
    private static Lottery lottery = new Lottery();
    public static void main(String[] args) {
        Ball[] balls = new Ball [NUMBER_OF_BALLS];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));
    }
}
