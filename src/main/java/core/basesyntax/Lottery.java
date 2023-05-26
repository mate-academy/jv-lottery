package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random randomizer = new Random();

    public Ball getRandomBall() {
        int randNum = randomizer.nextInt(MAX_NUMBER + 1);
        Color color = supplier.getRandomColor(randomizer);
        return new Ball(randNum, color);
    }
}
