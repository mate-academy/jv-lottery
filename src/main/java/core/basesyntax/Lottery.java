package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_VALUE = 100;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER_VALUE));
    }
}
