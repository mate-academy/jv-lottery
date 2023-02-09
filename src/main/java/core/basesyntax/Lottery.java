package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final int MAX_RANDOM_NUMBER = 100;
        Ball ball = new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(MAX_RANDOM_NUMBER));
        return ball;
    }
}
