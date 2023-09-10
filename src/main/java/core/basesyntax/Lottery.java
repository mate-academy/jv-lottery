package core.basesyntax;

import core.basesyntax.model.Ball;
import core.basesyntax.model.Color;

import java.util.Random;

public class Lottery {
    private final Random magic = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), magic.nextInt(MAX_NUMBER));
    }

}
