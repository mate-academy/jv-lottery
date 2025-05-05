package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_POSSIBLE_BALL_NUMBER = 101;
    private ColorSupplier ballColor = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(MAXIMUM_POSSIBLE_BALL_NUMBER),
                ballColor.getRandomColor());
    }
}
