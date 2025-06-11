package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();

    private static final int MIN = 1;
    private static final int MAX = 100;

    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = supplier.getRandomColor();
        int randomNumber = random.nextInt(MAX - MIN + 1) + MIN;

        return new Ball(randomColor, randomNumber);
    }
}
