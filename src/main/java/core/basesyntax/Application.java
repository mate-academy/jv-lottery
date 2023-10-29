package core.basesyntax;

import core.basesyntax.objects.Ball;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery(100);

        final int NUMBER_OF_BALLS = 3;
        Ball[] balls = new Ball[NUMBER_OF_BALLS];
        // create three balls using class Lottery and print information about them in console

        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.printf("%d. %s\n", i + 1, balls[i]);
        }
    }
}
