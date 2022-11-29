package core.basesyntax;

import java.util.Random;

public class BallNumberSupplier {
    public int getRandomNumber() {
        return new Random().nextInt(100);
    }
}
