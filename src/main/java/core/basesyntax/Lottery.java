package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(MAX_NUMBER);
        String color = colorSupplier.getRandomColor();
        return new Ball(ballNumber, color);
    }
}
