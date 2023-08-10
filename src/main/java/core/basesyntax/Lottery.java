package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Ball ball = new Ball();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
