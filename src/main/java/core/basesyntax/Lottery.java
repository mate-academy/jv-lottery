package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private static final int MAX_VALUE = 100;
    private static final ColorSupplier NEWCOLOR = new ColorSupplier();

    public Ball getRandomBall() {
        String color = NEWCOLOR.getRandomColor();
        int number = RANDOM.nextInt(MAX_VALUE) + 1;
        return new Ball(color, number);
    }
}
