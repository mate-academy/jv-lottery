package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Random RANDOM = new Random();

    public Ball getRandomBall() {
        String randomColor = COLOR_SUPPLIER.getRandomColor();
        int randomNumber = RANDOM.nextInt(101);

        return new Ball(randomColor, randomNumber);
    }
}
