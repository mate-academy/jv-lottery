package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    Random rand = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), rand.nextInt(100));
    }
}
