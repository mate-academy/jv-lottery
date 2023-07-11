package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int LIMIT_FOR_RANDOM_NUMBERS = 100;

    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = rand.nextInt(LIMIT_FOR_RANDOM_NUMBERS);

        return new Ball(number, color);
    }

}
