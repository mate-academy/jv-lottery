package core.basesyntax;

import java.util.Random;

public class Lottery {

    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int value = random.nextInt(100);
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(value);
        return ball;
    }
}
