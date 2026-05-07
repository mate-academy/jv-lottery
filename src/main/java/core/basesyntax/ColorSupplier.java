package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public BallColor getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(BallColor.values().length);
        return BallColor.values()[index];
    }
}
