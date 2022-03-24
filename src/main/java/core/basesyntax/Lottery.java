package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BOUND = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int number = random.nextInt(BOUND);
        return new Ball(colorSupplier.getRandomColor(), number);

    }
}
