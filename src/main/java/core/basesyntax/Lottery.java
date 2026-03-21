package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();
    private final int maxNumber = 101;

    public Ball getRandomBall() {
        int number = random.nextInt(maxNumber);
        return new Ball(color.getRandomColor(), number);
    }
}
