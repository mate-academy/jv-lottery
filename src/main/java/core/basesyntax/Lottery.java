package core.basesyntax;

import java.util.Random;
public class Lottery {
    private static final int MAX_NUMBER = 100;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();
    public static Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();

        int randomNumber = random.nextInt(MAX_NUMBER + 1);

        return new Ball(randomColor, randomNumber);
    }
}
