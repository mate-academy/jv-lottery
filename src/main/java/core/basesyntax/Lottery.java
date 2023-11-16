package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_INT_BOUNDS = 100;

    public Ball getRandomBall() {
        String randomColor = new ColorSupplier().getRandomColor();
        int randomInt = new Random().nextInt(RANDOM_INT_BOUNDS);
        return new Ball(randomColor, randomInt);
    }
}
