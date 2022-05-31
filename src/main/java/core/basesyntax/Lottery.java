package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorsupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorsupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
    }
}
