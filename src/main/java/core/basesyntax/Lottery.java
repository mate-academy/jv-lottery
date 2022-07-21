package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final Random random = new Random();
    static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        int numberOfBall = random.nextInt(MAX_NUMBER);
        String colorOfBall = colorSupplier.getRandomColor();
        return new Ball(colorOfBall, numberOfBall);
    }
}
