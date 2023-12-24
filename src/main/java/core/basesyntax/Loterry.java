package core.basesyntax;

import java.util.Random;

public class Loterry {

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int randomInt = random.nextInt(1,100);

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),randomInt);
    }
}
