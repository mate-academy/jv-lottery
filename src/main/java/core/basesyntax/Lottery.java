package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(100));
        ball.setColor(supplier.getRandomColor().toString());
        return ball;
    }
}
