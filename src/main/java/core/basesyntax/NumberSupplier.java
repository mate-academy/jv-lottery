package core.basesyntax;

import java.util.Random;

public class NumberSupplier {

    private static final Random RANDOM = new Random();
    private static final int BOUND = 100;

    public int getRandomNumber() {
        return RANDOM.nextInt(BOUND);
    }
}
