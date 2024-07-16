package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public static final int MAX_BOUND = 100;

    public int getRandomNumber() {
        return new Random().nextInt(MAX_BOUND);
    }

    public Ball getRandomBall() {
        return new Ball(getRandomColor(), getRandomNumber());
    }
}
