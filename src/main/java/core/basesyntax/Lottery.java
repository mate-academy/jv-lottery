package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random newNumber = new Random();
    private final ColorSupplier newColor = new ColorSupplier();

    public Ball getRandomBall() {

        return new Ball(newColor.getRandomColor(), newNumber.nextInt(MAX_NUMBER));
    }
}
