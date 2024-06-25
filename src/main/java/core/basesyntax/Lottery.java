package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int max = 100;

    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Random random = new Random();
        return new Ball(color.getRandomColor(), random.nextInt(max));
    }
}
