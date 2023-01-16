package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int numberBall = new Random().nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor().toString(), numberBall);
    }
}
