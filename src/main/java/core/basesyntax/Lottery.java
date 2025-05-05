package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int VALUE = 100;
    private ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), new Random().nextInt(VALUE));
    }
}
