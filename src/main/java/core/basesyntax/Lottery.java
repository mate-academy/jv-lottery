package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_FIGURES = 100;
    private final Random random = new Random();
    private final ColorSupplier colSup = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colSup.getRandomColor().name(), random.nextInt(NUMBER_OF_FIGURES));
    }
}
