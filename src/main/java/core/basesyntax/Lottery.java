package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BALLS = 3;
    private static final int NUMBER_LIMIT = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getNumberOfBalls() {
        return NUMBER_OF_BALLS;
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(NUMBER_LIMIT);
        return new Ball(color, number);
    }
}
