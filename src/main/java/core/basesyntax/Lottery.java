package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUNDARY = 101;
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(NUMBER_BOUNDARY);

        return new Ball(randomColor, randomNumber);
    }
}
