package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxRandomNumber = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumder(new Random().nextInt(maxRandomNumber));
        return ball;
    }
}
