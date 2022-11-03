package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_ON_BALL = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(NUMBER_ON_BALL);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
