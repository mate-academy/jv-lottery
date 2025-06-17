package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier color = new ColorSupplier();
        return new Ball(color.getRandomColor(), random.nextInt(100));
    }
}
