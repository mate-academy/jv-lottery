package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUND = 100;

    public Ball getRandomBall() {
        Random rand = new Random();
        int ballNumber = rand.nextInt(NUMBER_BOUND);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        return new Ball(color, ballNumber);
    }
}
