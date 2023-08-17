package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private static Random random = new Random();
    private static final int bound = 100;

    public static int getRandomNumber() {
        int randomNumber = random.nextInt(bound);
        return randomNumber;
    }
}
