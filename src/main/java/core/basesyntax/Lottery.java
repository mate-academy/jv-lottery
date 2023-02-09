package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(NUMBER));
        return ball;
    }
}
