package core.basesyntax;

import java.util.Random;

public class RandomSupplier {
    private final Random random = new Random();

    public int getRandomValue(int value) {
        return random.nextInt(value);
    }
}
