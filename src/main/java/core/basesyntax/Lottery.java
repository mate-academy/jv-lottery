package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int numberOfBalls = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    protected Ball getRandomBall() {
        int index = random.nextInt(numberOfBalls);
        Ball ball = new Ball();
        ball.setNumber(index);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
