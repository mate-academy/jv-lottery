package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX_NUMBER = 100;

    public static Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(), new Random().nextInt(MAX_NUMBER + 1));
    }
}
