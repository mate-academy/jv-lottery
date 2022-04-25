package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static ColorSupplier supplier = new ColorSupplier();
    public static Random random = new Random();
    final int maxBound = 100;
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(maxBound));
        return ball;
    }
}
