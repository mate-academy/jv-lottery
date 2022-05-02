package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int value = new Random().nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(value);
        return ball;
    }
}
