package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int value = new Random().nextInt(100);
        return new Ball(color.getRandomColor(), value);
    }
}
