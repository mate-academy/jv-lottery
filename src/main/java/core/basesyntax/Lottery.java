package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_POSSIBLE_NUMBER = 101;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomball() {
        int randomNumber = random.nextInt(MAXIMUM_POSSIBLE_NUMBER);
        String randomColor = colorSupplier.getRandomColor();

        return new Ball(randomColor, randomNumber);
    }
}
