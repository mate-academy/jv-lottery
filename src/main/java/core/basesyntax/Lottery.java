package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final Random RANDOM = new Random();
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNumber = RANDOM.nextInt(MAX_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
