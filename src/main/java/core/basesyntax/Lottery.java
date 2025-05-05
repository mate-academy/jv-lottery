package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_VALUE = 100;

    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        return new Ball(new Random().nextInt(MAX_BALL_VALUE), color.getRandomColor());
    }
}
