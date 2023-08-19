package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private static final int BOUND = 100;
    private Random random = new Random();

    public int getRandomNumber() {
        int randomNumber = random.nextInt(BOUND);
        return randomNumber;
    }
}
