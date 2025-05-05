package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_QUANTITY = 100;
    private final ColorSupplier ballColor = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(NUMBER_QUANTITY + 1);
        return new Ball(ballColor.getRandomColor(), ballNumber);
    }
}
