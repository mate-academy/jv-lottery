package core.basesyntax;

import java.util.Random;

public class Lottery {

    private Ball ball = new Ball();
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
