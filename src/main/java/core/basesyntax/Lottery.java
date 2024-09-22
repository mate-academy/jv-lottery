package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALLS_VALUE = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();

        Random random = new Random();

        String color = String.valueOf(colorSupplier.getRandomColor().name());
        int number = random.nextInt(MAX_BALLS_VALUE);
        return new Ball(color, number);
    }

}
