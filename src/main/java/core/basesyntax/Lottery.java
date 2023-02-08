package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    private static final int MAX_RANDOM_NUMBER = 100;

    public int getRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER);
    }

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), this.getRandomNumber());
    }
}
