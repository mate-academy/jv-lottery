package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final ColorSupplier colorSupplier;

    static {
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        int number = new Random().nextInt(100);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
