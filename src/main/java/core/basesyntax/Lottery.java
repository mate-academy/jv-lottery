package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        return new Ball(randomColor.getRandomColor(), new Random().nextInt(MAXIMUM_NUMBER));
    }
}
