package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), random.nextInt(101));
    }
}
