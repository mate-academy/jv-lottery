package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int max = 100;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public static Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int randomnumber = new Random().nextInt(max);
        return new Ball(color,randomnumber);
    }
}
