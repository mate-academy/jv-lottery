package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int DEFAULT_ARRAY_SIZE = 3;

    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);

        Lottery lottery = new Lottery(colorSupplier, random);
        for (int i = 0; i < DEFAULT_ARRAY_SIZE; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
