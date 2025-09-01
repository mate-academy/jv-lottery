package core.basesyntax.service;

import core.basesyntax.model.Ball;
import core.basesyntax.model.Color;
import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER + 1);

        return new Ball(color, number);
    }
}
