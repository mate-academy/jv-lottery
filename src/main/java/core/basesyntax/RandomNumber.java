package core.basesyntax;

import java.util.Random;

public class RandomNumber {
    public int getRandomNumber() {
        return new Random().nextInt(100);
    }
}