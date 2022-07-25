package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        return new Ball(new Random().nextInt(99) + 1, color.getRandomColor());
    }
}
