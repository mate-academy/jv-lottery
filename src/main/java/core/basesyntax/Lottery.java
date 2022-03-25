package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int UPPER_BOUND = 100;

    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        Random randBall = new Random();
        return new Ball(randomColor.getRandomColor(),randBall.nextInt(UPPER_BOUND));
    }
}
