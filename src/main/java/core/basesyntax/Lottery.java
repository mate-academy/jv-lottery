package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_BALL_NUMBER);
        String color = colorSupplier.getRandomColor();
        return new Ball(number, color);
    }
}
