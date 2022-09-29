package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int index = random.nextInt(100);
        Ball ball = new Ball(supplier.getRandomColor(), index);
        return ball;
    }
}
