package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int bound = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getrandomball() {
        return new Ball(colorSupplier.getRandomColor(),random.nextInt(bound));
    }
}
