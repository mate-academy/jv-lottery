package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_FROM = 100;

    public Ball getRandomBall() {
        return new Ball((new Random().nextInt(RANDOM_FROM) + 1),
                new ColorSupplier().getRandomColor());
    }
}
