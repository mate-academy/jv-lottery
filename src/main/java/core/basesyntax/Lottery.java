package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER_EXCLUSIVE = 101;

    public Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(),
                new Random().nextInt(MAX_BALL_NUMBER_EXCLUSIVE));
    }
}
