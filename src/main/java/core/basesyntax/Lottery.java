package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BOUND = 100;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {

        int number = random.nextInt(BOUND);
        String colorStr = colorSupplier.getRandomColor();

        return new Ball(colorStr, number);
    }
}
