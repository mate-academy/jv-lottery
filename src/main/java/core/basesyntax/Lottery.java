package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxnumber = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(maxnumber);
        return new Ball(randomColor, randomNumber);
    }
}
