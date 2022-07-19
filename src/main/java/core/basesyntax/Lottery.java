package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();
    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100));
    }
}
