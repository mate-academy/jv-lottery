package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 101;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER);
        String randomColor = supplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
