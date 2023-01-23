package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int bound = 100;
    private final Random random = new Random();
    private final int randomNumber = random.nextInt(bound);
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String color = String.valueOf(colorSupplier.getRandomColor());

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(randomNumber);
        return ball;
    }
}
