package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(random, colorSupplier);
        Ball ball;
        for (int i = 0; i < 3; i++) {
            ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}

