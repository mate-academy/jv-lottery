package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int boundNumber = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(boundNumber);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
