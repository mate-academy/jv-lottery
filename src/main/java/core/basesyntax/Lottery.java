package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int maxNumber = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(maxNumber));
        ball.getNumber();
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
