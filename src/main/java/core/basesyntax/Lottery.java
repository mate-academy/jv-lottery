package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public String getRandomBall() {
        int index1 = new Random().nextInt(100);
        return String.valueOf(index1);
    }
}
