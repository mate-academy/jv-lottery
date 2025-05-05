package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAGIC_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(MAGIC_NUMBER);
        String ballColor = supplier.getRandomColor();
        return new Ball(ballColor, ballNumber);
    }
}
