package core.basesyntax;

import java.util.Random;
import model.Ball;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private final Random rand = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(rand.nextInt(MAX_RANDOM_NUMBER), colorSupplier.getRandomColor());
    }
}
