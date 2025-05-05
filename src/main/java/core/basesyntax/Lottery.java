package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static final int MAX_NUMBER = 101;
    private final Random random = new Random(47);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(Color.valueOf(colorSupplier.getRandomColor()), random.nextInt(MAX_NUMBER));
    }
}
