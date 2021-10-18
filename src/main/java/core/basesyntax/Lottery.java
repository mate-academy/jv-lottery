package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;

    public Ball getRandomBall() {
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(MAX_RANDOM_NUMBER);
        ColorSupplier color = new ColorSupplier();
        return new Ball(color.getRandomColor(), number);
    }
}
