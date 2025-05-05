package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    public int getRandomNumber() {
        return new Random().nextInt(100);
    }
}
