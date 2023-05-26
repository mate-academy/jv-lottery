package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private static final int DEFAULT_NUMBER_SPAN = 100;
    private Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(DEFAULT_NUMBER_SPAN);
    }
}
