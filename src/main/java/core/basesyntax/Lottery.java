package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RandomNumber = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(new Random().nextInt(MAX_RandomNumber));
        return ball;
    }
}
