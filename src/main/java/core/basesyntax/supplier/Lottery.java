package core.basesyntax.supplier;

import core.basesyntax.Ball;
import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), new Random().nextInt(100));
    }
}
