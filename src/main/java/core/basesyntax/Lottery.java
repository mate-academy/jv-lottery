package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALLS = 100;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        int number = random.nextInt(MAX_BALLS) + 1;
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
