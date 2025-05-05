package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomColor = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = randomColor.nextInt(MAX_NUMBER) + 1;
        return new Ball(color, number);
    }
}
