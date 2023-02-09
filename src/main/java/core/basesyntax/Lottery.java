package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxNumber = 100;

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(maxNumber));
    }
}
