package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int COUNT_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(COUNT_NUMBER + 1);
        return new Ball(colorSupplier.getRandomColor(),number);
    }
}
