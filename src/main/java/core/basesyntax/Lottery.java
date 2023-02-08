package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int limit = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(limit);
        Color randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
