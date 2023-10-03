package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    private Random random = new Random();

    public Ball getRandomBall() {
        // Abbreviation in name 'RANDOM_NUMBER'
        // must contain no more than '2' consecutive capital letters.
        final int Random_Number = random.nextInt(100);
        // Abbreviation in name 'RANDOM_COLOR'
        // must contain no more than '2' consecutive capital letters.
        final String Random_Color = COLOR_SUPPLIER.getRandomColor();
        Ball randomBall = new Ball(Random_Color, Random_Number);
        return randomBall;
    }
}
