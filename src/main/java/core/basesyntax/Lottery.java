package core.basesyntax;

import java.util.Random;


public class Lottery {
    private static final int MAX_NUMBER = 100;
    public static final Random RANDOM = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNumber = RANDOM.nextInt(MAX_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
