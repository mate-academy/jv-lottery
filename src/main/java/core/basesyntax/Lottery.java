package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BAll_NUMBER = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_BAll_NUMBER + 1));
    }
}
