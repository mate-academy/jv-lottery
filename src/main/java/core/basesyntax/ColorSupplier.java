package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public BallColors getRandomColor() {
        int index = new Random().nextInt(BallColors.values().length);
        return BallColors.values()[index];
    }
}
