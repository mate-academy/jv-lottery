package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private Random randomNumber = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int number = randomNumber.nextInt(MAX_RANDOM_NUMBER);
        return new Ball(color.getRandomColor(), number);
    }
}
