package core.basesyntax;

import java.util.Random;

public class Number {
    public int randomNumberForBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber;
    }
}
