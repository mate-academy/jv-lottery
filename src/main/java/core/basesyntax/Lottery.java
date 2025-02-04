package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private static final int MAX_NUMBER = 101;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int number = RANDOM.nextInt(MAX_NUMBER);
        return new Ball(color, number);
    }
}
