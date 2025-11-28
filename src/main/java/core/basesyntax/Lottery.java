package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private static final String[] COLORS = {"Red", "Blue", "Green", "Yellow", "Black", "White"
    };
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    public Ball getRandomBall() {
        String color = COLORS[random.nextInt(COLORS.length)];
        int number = random.nextInt(MAX_NUMBER + 1); // 0–100 inclusive
        return new Ball(color, number);
    }
}
