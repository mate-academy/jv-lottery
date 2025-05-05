package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BALL_NUMBER = 101;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(MAX_BALL_NUMBER), colorSupplier.getRandomColor());
    }
}

