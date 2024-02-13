package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        final int maxRandomNumber = 101;
        final int randomNumber = random.nextInt(maxRandomNumber);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
