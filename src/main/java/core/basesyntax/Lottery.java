package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE_OF_BALL = 101;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int number = random.nextInt(MAX_VALUE_OF_BALL);
        return new Ball(colorSupplier.getRandomColor().toString(), number);
    }
}
