package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxRandomNumber = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(maxRandomNumber);
        return new Ball(randomColor, randomNumber);
    }
}
