package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int ballNumber = 100;

    public Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(), ColorSupplier.random.nextInt(ballNumber));
    }
}
