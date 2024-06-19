package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = new Random();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(101));
    }
}
