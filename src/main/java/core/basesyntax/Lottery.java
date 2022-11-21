package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random num = new Random(100);
        ColorSupplier supplier = new ColorSupplier();
        Ball ball = new Ball(num, supplier.getRandomColor());
        return ball;
    }
}
