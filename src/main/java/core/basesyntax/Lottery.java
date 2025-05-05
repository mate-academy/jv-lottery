package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxValue = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(maxValue);
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, number);
    }
}
