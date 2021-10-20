package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Ball ball = new Ball(supplier.getRandomColor(), new Random().nextInt(100));
        return ball;
    }
}
