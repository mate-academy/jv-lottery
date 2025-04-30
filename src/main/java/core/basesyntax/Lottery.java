package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int randomint = random.nextInt(MAX_NUMBER);
        return new Ball(colorSupplier.getRandomColor(), randomint);
    }
}
