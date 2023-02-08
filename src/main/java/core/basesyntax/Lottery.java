package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_COUNT = 100;
    private Random random;
    private ColorSupplier colorSupplier;

    public Ball getRandomBall() {
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        int number = random.nextInt(MAX_COUNT);
        return new Ball(color, number);
    }
}
