package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    public int getRandomBall() {
        java.util.Random random  = new Random();
        int value = random.nextInt(100);
        return value;
    }
}
