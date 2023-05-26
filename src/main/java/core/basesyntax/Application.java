package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(random, colorSupplier);
        Ball[] balls = new Ball[3];

        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.printf("%d. %s\n", i + 1, balls[i].toString());
        }
    }
}
