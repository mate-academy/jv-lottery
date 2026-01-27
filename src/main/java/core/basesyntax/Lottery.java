package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();

        // random.nextInt(100) дає від 0 до 99.
        // Щоб включити 100, треба писати 101 або (MAX_NUMBER + 1)
        int number = random.nextInt(MAX_NUMBER + 1);

        return new Ball(color, number);
    }
}
