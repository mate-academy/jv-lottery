package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BOUND = 100;

    public String getRandomBall() {
        Random random = new Random();
        ColorSupplier firstColor = new ColorSupplier();

        return "color of the ball: " + firstColor.getRandomColor()
                + ", number of the ball: " + random.nextInt(BOUND) + ".";
    }
}
