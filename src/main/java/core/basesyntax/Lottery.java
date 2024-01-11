package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMITING_NUMBER = 101;

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(LIMITING_NUMBER));
    }
}
