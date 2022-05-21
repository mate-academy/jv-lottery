package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier supplier = new ColorSupplier();
    Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball(supplier.getRandomColor(), random.nextInt(100));
        return ball;
    }
}

