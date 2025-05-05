package core.basesyntax;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    private static final int MAX_POSSIBLE_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = ThreadLocalRandom.current().nextInt(MAX_POSSIBLE_NUMBER + 1);
        return new Ball(randomColor, randomNumber);
    }
}
