package core.basesyntax;

import core.basesyntax.objects.Ball;

public class Application {
    private static final int numberOfBalls = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery(100);
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[numberOfBalls];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.printf("%d. %s\n", i + 1, balls[i]);
        }
    }
}
