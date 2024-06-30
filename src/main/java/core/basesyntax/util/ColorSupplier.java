package core.basesyntax.util;

import core.basesyntax.model.Ball;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public static Ball.Color getRandomColor() {
        return Ball.Color.values()[random.nextInt(Ball.Color.values().length)];
    }
}
