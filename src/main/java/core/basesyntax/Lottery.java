package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int numberOfNumbers = 100;
        return new Ball(color.getRandomColor(), random.nextInt(numberOfNumbers));
    }
}
