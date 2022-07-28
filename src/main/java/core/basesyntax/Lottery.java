package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;

    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        int number = new Random().nextInt(BOUND);
        return new Ball(color.getRandomColor(), number);
    }
}
