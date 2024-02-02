package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = new Random().nextInt(NUMBER);
        return new Ball(colorSupplier.getRandomColor(),number);
    }
}

