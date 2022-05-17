package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int NUMBER = 100;

    public static Ball getRandomBall(Random random, ColorSupplier color) {
        return new Ball(color.getRandomColor(), random.nextInt(NUMBER));
    }
}
