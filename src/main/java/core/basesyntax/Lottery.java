package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static final byte MAX_POSSIBLE_BALL_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),
                new Random().nextInt(MAX_POSSIBLE_BALL_NUMBER));
    }
}
