package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber;
    }
}
