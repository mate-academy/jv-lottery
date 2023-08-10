package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND_OF_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(BOUND_OF_NUMBER) + 1;
        return new Ball(color, number);
    }
}
