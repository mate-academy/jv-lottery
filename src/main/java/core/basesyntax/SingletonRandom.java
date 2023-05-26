package core.basesyntax;

import java.util.Random;

public final class SingletonRandom extends Random {
    private static Random random;

    private SingletonRandom() {
    }

    public static Random getInstance() {
        if (random == null) {
            random = new Random();
        }
        return random;
    }
}
