package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        int index = new Random().nextInt(100) + 1;
        return new Ball(color.getRandomColor(), index);
    }
}
