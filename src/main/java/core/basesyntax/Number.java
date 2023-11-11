package core.basesyntax;

import java.util.Random;

public class Number {
    private Random random = new Random();

    public int getRandomInt() {
        int randomInt = random.nextInt(101);
        return randomInt;
    }
}
