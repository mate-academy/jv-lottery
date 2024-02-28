package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier newcolor = new ColorSupplier();
    private final Random RANDOM = new Random();
    private final int MAX_VALUE = 100;

    public Ball getRandomBall() {
        String color = newcolor.getRandomColor();
        int number = RANDOM.nextInt(MAX_VALUE) + 1;
        return new Ball(color, number);
    }
}
