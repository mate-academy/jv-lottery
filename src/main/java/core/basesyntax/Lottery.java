package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BALLS = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(NUMBER_OF_BALLS);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
