package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random rand;
    private ColorSupplier colorSupplier;

    public Ball getRandomBall() {
        return new Ball(rand.nextInt(100), colorSupplier.getRandomColor());
    }
}
