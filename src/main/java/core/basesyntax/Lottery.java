package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public int getRandomNumber() {
        final int MAX_BOUND = 100;
         return new Random().nextInt(MAX_BOUND);
    }
    public Ball getRandomBall() {
        return new Ball(getRandomColor(), getRandomNumber());
    }
}
