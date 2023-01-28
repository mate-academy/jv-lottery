package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxBallNumber = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random number = new Random();
        return new Ball(colorSupplier.getRandomColor(),number.nextInt(maxBallNumber));
    }
}
