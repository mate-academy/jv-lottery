package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private static final int NUMBER_BOUND = 100;

    private final Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(NUMBER_BOUND);
    }
}
