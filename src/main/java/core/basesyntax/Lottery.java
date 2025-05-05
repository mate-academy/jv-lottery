package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALLS_NUMBER = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_BALLS_NUMBER) + 1;

        return new Ball(color, number);
    }
}
