package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BOUND = 100;
    private final Random random = new Random();
    private final ColorSupplier firstColor = new ColorSupplier();

    public String getRandomBall() {
        return "color of the ball: " + firstColor.getRandomColor()
                + ", number of the ball: " + random.nextInt(BOUND) + ".";
    }
}
