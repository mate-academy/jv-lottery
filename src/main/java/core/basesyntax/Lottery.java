package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int UPPER_LIMIT = 101;
    private static Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(UPPER_LIMIT);
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball(colorSupplier.getRandomColor(), random.nextInt(UPPER_LIMIT));
        return ball;
    }
}
