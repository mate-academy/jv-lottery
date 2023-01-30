package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxNumber = 100;
    public Ball getRandomBall() {
        Ball ball = new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(maxNumber));
        return ball;
    }
}
