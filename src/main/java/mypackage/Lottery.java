package mypackage;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 100;
    private static final Random random = new Random();
    private static final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(BALL_COUNT);
        String randomColor = supplier.getRandomColor();
        return new Ball(randomColor,randomNumber);
    }
}
