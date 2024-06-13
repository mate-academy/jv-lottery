package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private static final Random random = new Random();
    private static final int MAX_NUMBER = 100;

    public int getRandomNumber() {
        return random.nextInt(MAX_NUMBER);
    }
}
