package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String randColor = colorSupplier.getRandomColor();
        int randNumber = random.nextInt(MAX_NUMBER) + 1;
        return new Ball(randColor, randNumber);
    }
}
