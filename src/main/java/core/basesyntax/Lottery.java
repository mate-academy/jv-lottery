package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int COLOR_COUNT = 101;
    private final ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(COLOR_COUNT);
        return new Ball(color, number);
    }
}
