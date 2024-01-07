package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final static Random random = new Random();
    private final static ColorSupplier color = new ColorSupplier();
    private final static int LIMIT = 100;

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), random.nextInt(LIMIT));
    }
}
