package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        return new Ball(color.getRandomColor(), new Random().nextInt(100));
    }
}
