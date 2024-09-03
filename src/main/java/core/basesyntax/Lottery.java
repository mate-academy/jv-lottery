package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BOUND = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public String getRandomBall() {
        return "Color and number of the ball: " + colorSupplier.getRandomColor()
                + ", " + random.nextInt(BOUND) + ".";
    }
}
