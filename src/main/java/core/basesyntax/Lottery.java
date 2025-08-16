package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final int max = 101;
    private final int number = new Random().nextInt(max);

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();

        return new Ball(color, number);
    }
}
