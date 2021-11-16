package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int value = random.nextInt(100);
        Ball ball = new Ball(value,color.getRandomColor());
        return ball;
    }
}
