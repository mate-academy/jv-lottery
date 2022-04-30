package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public static final int COUNT = 3;
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100));
    }
}
