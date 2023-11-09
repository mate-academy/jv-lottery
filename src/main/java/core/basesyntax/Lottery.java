package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int max = 100;

    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomnumber = new Random().nextInt(max);
        return new Ball(colorSupplier.getRandomColor(), randomnumber);
    }
}
