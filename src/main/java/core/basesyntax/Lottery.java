package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 101;
    private final Random random = new Random();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(MAX_VALUE);
        String color = new ColorSupplier().getRandomColor();
        return new Ball(color, ballNumber);
    }
}
