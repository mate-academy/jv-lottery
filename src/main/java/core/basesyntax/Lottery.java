package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int bound = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = String.valueOf(colorSupplier.getRandomColor());
        int randomBall = new Random().nextInt(bound);
        return new Ball(randomColor,randomBall);
    }
}
