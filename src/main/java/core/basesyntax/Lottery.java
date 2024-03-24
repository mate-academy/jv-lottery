package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball(random.nextInt(MAX_NUMBER),
                colorSupplier.getRandomColor());
        return ball;
    }
}
