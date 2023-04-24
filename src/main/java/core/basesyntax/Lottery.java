package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final Random random = new Random();
    static final ColorSupplier colorSupplier = new ColorSupplier();
    static final int MAX_NUMBER = 100;

    public static Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
