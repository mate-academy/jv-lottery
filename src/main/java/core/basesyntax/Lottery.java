package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        int randomInt = random.nextInt(MAX_NUMBER);
        String randomColor = new ColorSupplier().getRandomColor();
        return new Ball(randomColor, randomInt);
    }
}
