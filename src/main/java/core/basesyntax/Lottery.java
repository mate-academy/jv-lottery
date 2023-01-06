package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final int MIN = 1;
    private final int MAX = 100;

    public Ball getRandomBall() {
        return new Ball (new ColorSupplier().getRandomColor(), new Random().nextInt(MAX-MIN + 1) + MIN);
    }
}
