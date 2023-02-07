package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    public Ball getRandomBall() {
        int index = random.nextInt(100);
        Ball ball = new Ball(colorSupplier.getRandomColor(), index);
        return ball;
    }
}
