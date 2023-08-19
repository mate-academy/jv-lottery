package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUND = 100;

    public Ball getRandomBall() {
        Ball newBall = new Ball(new Random().nextInt(NUMBER_BOUND),
                new ColorSupplier().getRandomColor());
        return newBall;
    }
}
