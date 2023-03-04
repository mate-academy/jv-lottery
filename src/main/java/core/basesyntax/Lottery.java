package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUM = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNum = random.nextInt(MAX_RANDOM_NUM);
        return new Ball(colorSupplier.getRandomColor(), randomNum);
    }
}
