package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public BallColor getRandomColor() {
        return BallColor.values()[random.nextInt(BallColor.values().length)];
    }
}
