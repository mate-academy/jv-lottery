package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(ColorSet.values().length);
        return ColorSet.values()[index].toString();
    }
}
