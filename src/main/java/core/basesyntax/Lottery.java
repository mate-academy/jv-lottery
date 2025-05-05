package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(100);
        Ball ball = new Ball(colorSupplier.getRandomColor(), number);
        return ball;
    }
}
