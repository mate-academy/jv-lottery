package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUBMER_OF_BALS = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(NUBMER_OF_BALS);
        return new Ball(color, number);
    }
}
