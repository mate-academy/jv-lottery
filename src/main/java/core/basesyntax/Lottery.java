package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int lot = 100;
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(lot));
    }

}
