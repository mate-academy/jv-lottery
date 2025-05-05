package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_OF_BALLS = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String colors = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER_OF_BALLS + 1);
        return new Ball(colors, number);
    }
}
