package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Ball ball = new Ball();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random rand = new Random();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(rand.nextInt(100));
        return ball;
    }
}
