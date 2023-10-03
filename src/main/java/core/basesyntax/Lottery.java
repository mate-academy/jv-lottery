package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXCount = 100;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(),random.nextInt(MAXCount));
    }
}
