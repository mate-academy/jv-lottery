package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BALL_MAX_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(), new Random().nextInt(BALL_MAX_NUMBER));
    }
}
