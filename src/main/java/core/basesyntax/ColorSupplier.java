package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(ColorBall.values().length);
        return ColorBall.values()[index].toString();
    }
}
