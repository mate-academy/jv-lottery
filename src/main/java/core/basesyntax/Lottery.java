package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER + 1);

        Colors colors = Colors.valueOf(color.getRandomColor());

        return new Ball(colors, randomNumber);
    }
}
