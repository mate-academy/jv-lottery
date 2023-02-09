package core.basesyntax;

import java.util.Random;

public class Lottery {
    final static private int RANDOM_NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(RANDOM_NUMBER));
        return ball;
    }
}
