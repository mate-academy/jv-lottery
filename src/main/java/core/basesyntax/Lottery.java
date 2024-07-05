package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        String randomColor = colorSupplier.getRandomColor();
        ball.setColor(randomColor);
        ball.setNumber(random.nextInt(MAX_VALUE));
        return ball;
    }
}
