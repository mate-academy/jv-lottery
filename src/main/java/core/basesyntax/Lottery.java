package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random randomNumber;
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.randomNumber = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), randomNumber.nextInt(100));
    }
}
