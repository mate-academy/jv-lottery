package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier randomColorSupplier = new ColorSupplier();
        return new Ball(randomColorSupplier.getRandomColor(), new Random().nextInt(100));
    }
}
