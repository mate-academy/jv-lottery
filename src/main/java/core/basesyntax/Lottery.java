package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int ballNumberBound = 100;
        return new Ball(colorSupplier.getRandomColor(), new Random().nextInt(ballNumberBound));
    }
}
