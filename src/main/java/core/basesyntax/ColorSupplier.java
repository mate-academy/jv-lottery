package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_COUNT = ColorList.values().length;

    public String getRandomColor() {
        int index = new Random().nextInt(COLORS_COUNT);
        return ColorList.values()[index].name().toLowerCase();
    }
}
