package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().toString();
        int number = new Random().nextInt(MAX_NUMBER) + 1;
        return new Ball(color, number);
    }
}
