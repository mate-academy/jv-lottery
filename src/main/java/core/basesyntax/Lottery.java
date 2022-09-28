package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private static Random rand = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public static Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), rand.nextInt(BOUND));
    }
}
