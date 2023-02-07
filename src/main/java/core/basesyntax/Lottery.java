package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int random = RANDOM.nextInt(100);
        return new Ball(new ColorSupplier().getRandomColor(),random);
    }
}
