package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private int getRandomNumber() {
        final int maxPossibleNumber = 100;
        return new Random().nextInt(maxPossibleNumber);
    }
}
