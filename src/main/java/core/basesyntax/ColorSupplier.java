package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public ColorsForBall getRandomColor() {
        int index = new Random().nextInt(ColorsForBall.values().length);
        return ColorsForBall.values()[index];
    }
}
