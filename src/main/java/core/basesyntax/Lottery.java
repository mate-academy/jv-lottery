package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BOUND_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(BOUND_NUMBER));
    }
}
