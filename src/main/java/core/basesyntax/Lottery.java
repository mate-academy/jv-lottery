package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        Ball ball = new Ball(supplier.getRandomColor(), random.nextInt(100));
        return ball;
    }
}
