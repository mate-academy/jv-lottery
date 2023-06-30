package core.basesyntax;

import java.util.Random;

public class Lottery {
    protected Ball getRandomBall() {
        final int numberOfBalls = 100;
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = new Random().nextInt(numberOfBalls);
        Ball ball = new Ball();
        ball.setNumber(index);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
