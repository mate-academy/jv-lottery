package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final Random random = new Random(47);
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(Color.valueOf(colorSupplier.getRandomColor()), random.nextInt(101));
    }
}
