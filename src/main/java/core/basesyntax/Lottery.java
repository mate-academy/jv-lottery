package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_POSSIBLE_NUMBER_ON_BALL = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(),
                new Random().nextInt(MAX_POSSIBLE_NUMBER_ON_BALL));
    }
}
