package core.basesyntax;

import java.util.Random;

public class NumberSupplier extends Ball {
    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber;
    }
}
