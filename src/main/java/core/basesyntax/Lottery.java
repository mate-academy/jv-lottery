package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();
    private final int COUNT = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        int index = random.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(index, colorSupplier.getRandomColor());
    }
}
