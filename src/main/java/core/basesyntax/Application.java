package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        final int SIZE = 3;
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        Lottery lottery = new Lottery(random, supplier);
        Ball[] balls = new Ball[SIZE];
        for (int i = 0; i < SIZE; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
