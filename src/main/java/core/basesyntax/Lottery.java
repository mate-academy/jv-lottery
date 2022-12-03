package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    Ball getRandomBall() {
        int constant = 100;
        Ball ball = new Ball(random.nextInt(constant), supplier.getRandomColor());
        return ball;
    }
}
