package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxNumber = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int value = random.nextInt(maxNumber);
        Ball newBall = new Ball(value, randomColor);
        return newBall;
    }
}
