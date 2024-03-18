package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX = 101;
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public static Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(MAX);

        return new Ball(color, randomNumber);
    }
}
