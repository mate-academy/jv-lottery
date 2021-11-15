package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    public Ball getRandomBall() {
        int value = random.nextInt(100);
        Ball ball = new Ball(value,ColorSupplier.getRandomColor());
        return ball;
    }
}
