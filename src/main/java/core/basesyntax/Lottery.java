package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static ColorSupplier supplier = new ColorSupplier();
    public static Random random = new Random();
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
