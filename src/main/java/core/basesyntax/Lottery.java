package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX_NUMBER = 100;
    private static final Random random = new Random();
    private static final ColorSupplier color = new ColorSupplier();

    public static Ball getRandomBall() {
        return new Ball(color.getRandomColor(), random.nextInt(MAX_NUMBER));
    }
}
