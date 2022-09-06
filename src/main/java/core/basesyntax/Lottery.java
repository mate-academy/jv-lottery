package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_BALL_NUMBER = 101;

    private static final Random random = new Random();

    public static Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(), random.nextInt(MAX_BALL_NUMBER));
    }

}
