package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;

    public Ball getRandomBall() {

        ColorSupplier colorSupplier = new ColorSupplier();

        String color = colorSupplier.getRandomColor();

        return new Ball(color, new Random().nextInt(MAX_VALUE));
    }
}
