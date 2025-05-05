package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_POSITIVE_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_POSITIVE_NUMBER);
        return new Ball(colorSupplier.getRandomColor(),number);
    }
}
