package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_COUNT = 100;
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = rand.nextInt(NUMBER_COUNT) + 1;
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
