package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public ColorBall getRandomColor() {
        int index = new Random().nextInt(ColorBall.values().length);
        return ColorBall.values()[index];
    }
}
