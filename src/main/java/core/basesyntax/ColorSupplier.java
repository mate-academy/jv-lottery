package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public BallColors getRandomColor() {
        return BallColors.values()[new Random().nextInt(BallColors.values().length)];
    }
}
