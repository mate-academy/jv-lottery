package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random randomizer = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(
                this.colorSupplier.getRandomColor(),
                this.randomizer.nextInt(MAX_NUMBER + 1)
        );
    }
}
