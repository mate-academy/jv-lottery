package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_OF_BALL = 100;
    private final Random random ;
    private final ColorSupplier colorSupplier;

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_NUMBER_OF_BALL);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }
}
