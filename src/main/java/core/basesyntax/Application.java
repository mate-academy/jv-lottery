package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int COUNT_BOLLS = 3;

    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(random, colorSupplier);
        for (int i = 0; i < COUNT_BOLLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
