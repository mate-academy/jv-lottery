package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private final String color = ColorSupplier.getRandomColor();
    private final int number = 100;
    private int index = random.nextInt(number);

    public Ball getRandomBall() {
        return new Ball(color, index);
    }
}
