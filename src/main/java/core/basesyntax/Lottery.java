package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int RANDOM_SIZE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(RANDOM_SIZE);
        return new Ball(number, color);
    }
}
