package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static final int NUMBER = 101;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(NUMBER));
    }
}
