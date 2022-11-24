package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random RANDOM = new Random();
    private final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), RANDOM.nextInt(MAX_NUMBER));
    }
}
