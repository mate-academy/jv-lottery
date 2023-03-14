package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxNumber = 100;

    public static Ball getRandomBall() {
        Colors color = ColorSupplier.getRandomColor();
        int number = new Random().nextInt(maxNumber);
        return new Ball(color, number);
    }
}
