package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_NUMBER = 100;

    private int getRandomNumber() {
        return new Random().nextInt(MAX_NUMBER);
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), getRandomNumber());
    }
}
