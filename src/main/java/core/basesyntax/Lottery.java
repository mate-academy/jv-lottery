package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier color = new ColorSupplier();
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER);
        return new Ball(color.getRandomColor(), randomNumber);
    }
}
