package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), random.nextInt(100));
    }

}
