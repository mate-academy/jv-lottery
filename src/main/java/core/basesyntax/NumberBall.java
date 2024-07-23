package core.basesyntax;

import java.util.Random;

public class NumberBall {
    public int getRandomNumber() {
        Random randomNumber = new Random();
        int value = randomNumber.nextInt(100);
        return value;
    }
}
