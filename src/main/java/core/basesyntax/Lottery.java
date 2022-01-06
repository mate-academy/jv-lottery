package core.basesyntax;

import java.util.Random;

public class Lottery {

    private Random random = new Random();
    private int value = random.nextInt(100);

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(value);
        return ball;
    }
}
