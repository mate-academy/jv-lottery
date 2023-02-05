package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random number = new Random();

    public Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(),number.nextInt(100));
    }
}
