package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_NUMBER_COUNT = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int number = random.nextInt(MAX_NUMBER_COUNT);
        ball.setNum(number);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
