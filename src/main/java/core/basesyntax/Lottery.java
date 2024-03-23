package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int maxNumber = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Lottery getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(maxNumber));
    }
}
