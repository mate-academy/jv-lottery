package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(BOUND);
        String color = colorSupplier.getRandomColor().name();
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(randomNumber);
        return ball;
    }
}
