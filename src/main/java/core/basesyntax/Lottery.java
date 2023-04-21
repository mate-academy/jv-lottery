package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Ball ball = new Ball();

    public Ball getRandomBall() {
        int numberOfBall = new Random().nextInt(100);
        ball.setColor(colorSupplier.getRandomColor().name());
        ball.setNumber(numberOfBall);
        return ball;
    }
}
