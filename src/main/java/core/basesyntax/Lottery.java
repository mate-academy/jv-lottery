package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    String color = colorSupplier.getRandomColor();
    int number = new Random().nextInt(MAX_RANDOM_NUMBER) + 1;

    public Ball getRandomBall() {
        return new Ball(color, number);
    }
}
