package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_NUMBER); // від 1 до 100
        return new Ball(randomColor, randomNumber);
    }
}
