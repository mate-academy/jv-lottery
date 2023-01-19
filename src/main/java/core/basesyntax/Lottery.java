package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private final String color = ColorSupplier.getRandomColor();
    private final int index = random.nextInt(100);

    public Ball getRandomBall() {
        return new Ball(color, index);
    }
}
