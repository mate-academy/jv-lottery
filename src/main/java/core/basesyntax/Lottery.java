package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = getRandomNumber();
        return new Ball(color, number);
    }

    public int getRandomNumber() {
        return random.nextInt(MAX_NUMBER);
    }
}
