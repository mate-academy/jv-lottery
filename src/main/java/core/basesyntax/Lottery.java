package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_COUNT = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),random.nextInt(RANDOM_COUNT));
    }
}