package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxNumber = 100;

    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(maxNumber) + 1;
        return new Ball(color, number);
    }
}
