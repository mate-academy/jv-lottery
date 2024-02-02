package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BALL = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {

        String colors = colorSupplier.getRandomColor();
        int number = random.nextInt(NUMBER_OF_BALL + 1);
        return new Ball(colors, number);
    }
}