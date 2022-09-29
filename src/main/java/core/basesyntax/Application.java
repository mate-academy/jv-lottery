package core.basesyntax;

import java.util.Arrays;

public class Application {
    private static final int AMOUNT_OF_BALLS = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[AMOUNT_OF_BALLS];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Lottery().getRandomBall();
        }
        System.out.println("Welcome to the Mate Lottery! Your three winning balls today are:\n"
                + Arrays.toString(balls)
                + "\nCongratulations =)");
    }
}
