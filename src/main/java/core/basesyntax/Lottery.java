package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_NUMBER = new Random().nextInt(Color.values().length);

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), RANDOM_NUMBER);
    }
}
