package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BALL_NUMBER_RANDOM = 100;

    public Ball getRandomBall() {
        return new Ball(new Random().nextInt(MAX_BALL_NUMBER_RANDOM),
                        new ColorSupplier().getRandomColor());
    }
}
