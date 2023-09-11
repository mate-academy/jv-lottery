package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private static final Random RANDOM = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public static Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = RANDOM.nextInt(MAX_NUMBER) + 1;
        return new Ball(randomColor, randomNumber);
    }
}