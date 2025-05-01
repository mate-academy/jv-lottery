package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int THE_MAXIMUM_POSSIBLE_NUMBER_OF_BALLS = 101;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(THE_MAXIMUM_POSSIBLE_NUMBER_OF_BALLS);

        return new Ball(color, number);
    }
}
