package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int RANGE = 100;

    public Ball getRandomBall() {
        int value = new Random().nextInt(RANGE);
        return new Ball(new ColorSupplier().getRandomColor(), value);
    }
}
