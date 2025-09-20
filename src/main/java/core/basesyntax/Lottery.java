package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        String color = colorSupplier.getRandomColor();
        ball.setColor(color);

        int number = 1 + random.nextInt(MAX_NUMBER);
        ball.setNumber(number);

        return ball;
    }
}
