package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BOARD = 100;

    public static Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_BOARD));
    }
}
