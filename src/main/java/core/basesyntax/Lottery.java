package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private int boundNumber = 100;

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(boundNumber);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
