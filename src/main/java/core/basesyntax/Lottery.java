package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        ball.setNumber(random.nextInt(100));
        ball.setColor(supplier.getRandomColor());
        return ball;
    }
}
