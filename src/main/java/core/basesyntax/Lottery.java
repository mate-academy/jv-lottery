package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM = 100;
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Random RANDOM = new Random();

    public Ball getRandomBall() {
        Color ballColor = COLOR_SUPPLIER.getRandomColor();
        int randomNumber = RANDOM.nextInt(MAX_RANDOM);
        return new Ball(ballColor, randomNumber);
    }
}
