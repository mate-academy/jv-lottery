package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private static final int BOUND = 100;
    private Random random = new Random();
    private int randomNumber;

    private void setRandomNumber() {
        this.randomNumber = random.nextInt(BOUND);
    }

    public int getRandomNumber() {
        setRandomNumber();
        return randomNumber;
    }
}
