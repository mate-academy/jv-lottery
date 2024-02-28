package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final Random RANDOM = new Random();
    public static final int MAX_VALUE = 100;
    private final ColorSupplier newcolor = new ColorSupplier();

    public Ball getRandomBall() {
        String color = newcolor.getRandomColor();
        int number = RANDOM.nextInt(MAX_VALUE) + 1;
        return new Ball(color, number);
    }
}
