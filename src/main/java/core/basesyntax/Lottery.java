package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final int upperBound = 101;

    public Ball getRandomBall() {
        Color color = new ColorSupplier().getRandomColor();
        int randomNumber = random.nextInt(upperBound);

        return new Ball(color, randomNumber);
    }
}
