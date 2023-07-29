package core.basesyntax;

import java.util.Random;

public class Lottery {
    public final Random random = new Random();
    public final ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100));
    }
}
