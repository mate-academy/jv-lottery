package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball( new ColorSupplier().getRandomColor(),
                new Random().nextInt(MAX_NUMBER-MIN_NUMBER + 1) + MIN_NUMBER);
    }
}
