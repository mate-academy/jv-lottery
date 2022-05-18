package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(ColorType.values().length);
        return ColorType.values()[index].name();
    }
}
