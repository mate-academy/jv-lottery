package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random number = new Random(100);
        ColorSupplier supplier = new ColorSupplier();
        Ball ball = new Ball(number, supplier.getRandomColor());
        return ball;
    }
}
