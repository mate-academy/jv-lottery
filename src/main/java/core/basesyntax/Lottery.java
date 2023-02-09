package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    public static final int HUNDRED = 100;
    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),
                random.nextInt(HUNDRED));
    }
}
