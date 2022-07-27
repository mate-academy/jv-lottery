package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int max_number = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(max_number);
        return new Ball(color, number);
    }
}
