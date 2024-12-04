package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER = 101;
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), random.nextInt(BALL_NUMBER));
    }
}
