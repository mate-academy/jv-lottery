package core.basesyntax;

import core.basesyntax.objects.Ball;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        final int numberOfBalls = 3;
        final int maxNumberOnTheBall = 100;
        Ball[] balls = new Ball[numberOfBalls];
        Lottery lottery = new Lottery();

        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall(maxNumberOnTheBall);
            System.out.printf("%d. %s\n", i + 1, balls[i]);
        }
    }
}
