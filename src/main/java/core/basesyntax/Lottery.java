
package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;

    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random RANDOM = new Random();

    public Ball getRandomBall() {
        return new Ball(RANDOM.nextInt(MAX_NUMBER) + 1,colorSupplier.getRandomColor());
    }
}
