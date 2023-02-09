package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setNumber(random.nextInt(100));
        ball.setBallColor(colorSupplier.getRandomColor());
        return ball;
    }
}
