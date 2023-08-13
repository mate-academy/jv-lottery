package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_BALL_NUMBER);
        String color = colorSupplier.getRandomColor().name().toLowerCase();
        return new Ball(color, number);
    }
}
