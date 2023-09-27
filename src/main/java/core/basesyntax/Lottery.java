package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(101));
    }
}
