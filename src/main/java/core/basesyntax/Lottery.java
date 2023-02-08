package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_RANDOM_NUMBER);
    }

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), this.getRandomNumber());
    }
}
