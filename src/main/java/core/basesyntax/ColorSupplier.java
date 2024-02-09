package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public BallColor getRandomColor() {
        Random random = new Random();
        return BallColor.values()[random.nextInt(BallColor.values().length)];
    }
}
