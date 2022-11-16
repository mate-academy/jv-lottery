package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        return new Ball(getRandomColor(), random.nextInt(MAX_NUMBER));
    }
}
