package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int LOOP_COUNT = 3;

    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(colorSupplier, random);

        for (int i = 0; i < LOOP_COUNT; i++) {
            System.out.println(i + 1 + ". " + lottery.getRandomBall());
        }
    }
}
