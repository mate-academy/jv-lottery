package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private static final int MAX = 100;

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = getRandomNumber();
        return new Ball(color, number);
    }

    private int getRandomNumber() {
        return random.nextInt(MAX) + 1;
    }
}
