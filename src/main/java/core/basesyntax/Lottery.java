package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int LIMIT = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(LIMIT);
        String color = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(ballNumber);
        return ball;
    }
}
