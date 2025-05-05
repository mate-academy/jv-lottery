package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 101;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String ballColor = colorSupplier.getRandomColor();
        int ballNumber = random.nextInt(MAX_NUMBER);
        Ball ball = new Ball();
        ball.setColor(ballColor);
        ball.setNumber(ballNumber);
        return ball;
    }
}
