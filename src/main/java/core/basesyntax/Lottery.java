package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BOUND = 101;
    public final Random random = new Random();
    public final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),random.nextInt(MAX_BOUND));
    }
}
