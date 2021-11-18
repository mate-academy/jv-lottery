package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public ColorList getRandomColorList() {
        int index = new Random().nextInt(ColorList.values().length);
        return ColorList.values()[index];
    }
}
