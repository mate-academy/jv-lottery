package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_VALUE);
        return new Ball(color.getRandomColor(),number);
    }
}
