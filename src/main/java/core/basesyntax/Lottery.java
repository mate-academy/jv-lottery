package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(101));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
