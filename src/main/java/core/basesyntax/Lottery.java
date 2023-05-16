package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int number = new Random().nextInt(100);
        return new Ball(color.getRandomColor(), number);
    }
}
