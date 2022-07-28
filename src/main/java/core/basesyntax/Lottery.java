package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int BOUND_OF_RANOM = 100;

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(),
                new Random().nextInt(BOUND_OF_RANOM));
    }
}
