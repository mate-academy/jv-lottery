package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_BOUND = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(RANDOM_BOUND);
        return new Ball(randomColor, randomNumber);
    }
}
