package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANGE = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    
    public Ball getRandomBall() {
        Ball ball = new Ball();
       // Random random = new Random();
       // ColorSupplier supplier = new ColorSupplier();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_RANGE));
        return ball;
    }
}
