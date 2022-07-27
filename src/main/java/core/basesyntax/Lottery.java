package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final static int maxNumber = 100;
    private final ColorSupplier color;

    public Lottery (ColorSupplier color) {
        this.color = color;
    }

    public Ball getRandomBall() {
        int number = new Random().nextInt(maxNumber);

        return new Ball(color.getRandomColor(), number);
    }
}
