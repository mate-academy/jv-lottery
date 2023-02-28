package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    final int COUNT = 100;

    public int getRandomNumber() {
        return random.nextInt(COUNT);
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), getRandomNumber());
    }
}
