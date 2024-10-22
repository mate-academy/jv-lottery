package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();

    public static Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor();
        int number = random.nextInt(100) + 1; // Random number between 1 and 100
        return new Ball(color, number);
    }
}
