package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        ball.setColor(supplier.getRandomColor().toString());
        Random random = new Random();
        ball.setNumber(random.nextInt(101));
        return ball;
    }
}
