package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random randomGenerator = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor().toString(),
                randomGenerator.nextInt(100) + 1);
    }
}
