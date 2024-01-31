package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();
    private static final int MAX_NUMBER = 100;

    public static Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_NUMBER + 1);
        return new Ball(randomColor, randomNumber);
    }
}
