package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUNT = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Colors randomColor = Colors.valueOf(colorSupplier.getRandomColor());
        int randomNumber = random.nextInt(NUMBER_BOUNT) + 1;
        return new Ball(randomColor, randomNumber);
    }
}

