package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = getRandomNumber();
        return new Ball(color, number);
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_BALL_NUMBER) + 1;
    }
}
