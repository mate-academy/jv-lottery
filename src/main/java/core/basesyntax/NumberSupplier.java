package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private final Random random = new Random();
    private final int bound = 100;

    public int getRandomNumber() {
        return random.nextInt(bound);
    }
}
