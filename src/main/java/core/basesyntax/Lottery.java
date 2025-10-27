package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int bound = 101;

    public Ball getRandomBall() {
        return new Ball(random.nextInt(bound), colorSupplier.getRandomColor());
    }
}
