package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final int MAX_RANDOM_NUMBER = 100;

    public static Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor();
        int number = new Random().nextInt(MAX_RANDOM_NUMBER);
        return new Ball(color, number);
    }
}
