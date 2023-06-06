package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int MAXIMUM_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAXIMUM_NUMBER);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
