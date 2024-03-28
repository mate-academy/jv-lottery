package core.basesyntax;

import java.util.Random;

public class Lottery {
    protected ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier.Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_NUMBER) + 1;
        return new Ball(randomColor.toString(), randomNumber);
    }
}
