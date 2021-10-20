package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
