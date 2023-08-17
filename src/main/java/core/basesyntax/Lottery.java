package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int bound = 100;

    public static Ball getRandomBall() {
        int randomNumber = new Random().nextInt(bound);
        String randomColor = ColorSupplier.getRandomColor();
        return new Ball(randomNumber, randomColor);
    }
}
