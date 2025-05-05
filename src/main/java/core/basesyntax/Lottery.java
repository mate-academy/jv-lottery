package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        ball.setNumber(random.nextInt(100));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
