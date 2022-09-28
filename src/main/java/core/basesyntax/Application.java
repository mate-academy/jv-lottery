package core.basesyntax;

import java.util.Random;

public class Application {
    public static final int BALLS_COUNT = 3;

    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(random, colorSupplier);
        for (int i = 0; i < BALLS_COUNT; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
