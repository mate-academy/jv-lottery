package core.basesyntax;

import java.util.Arrays;

public class Application {
    private static final int numberOfBalls = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[numberOfBalls];
        for (int i = 0; i < balls.length; i++) {
            Lottery lottery = new Lottery();
            balls[i] = lottery.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));
    }
}
