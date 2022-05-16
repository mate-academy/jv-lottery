package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random randomNumber;
    private final ColorSupplier colorSupplier;

    public Lottery(Random randomNumber, ColorSupplier colorSupplier) {
        this.randomNumber = randomNumber;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(randomNumber), randomNumber.nextInt(100));
    }
}
