package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random randomSupplier = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), (int) (randomSupplier.nextFloat() * 101));
    }
}
