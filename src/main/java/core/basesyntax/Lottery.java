package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private Ball ball = new Ball();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
