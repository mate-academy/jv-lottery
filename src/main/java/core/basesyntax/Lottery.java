package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE_OF_BALL_NUMBER = 100;
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        String randomColor = supplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_VALUE_OF_BALL_NUMBER);
        return new Ball(randomColor, randomNumber);

    }
}
