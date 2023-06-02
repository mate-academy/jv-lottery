package core.basesyntax;

import java.util.Random;

public class RandomNumber {
    public int getRandomNumber() {
        int randomNumber = new Random().nextInt(100);
        return randomNumber;
    }
}
