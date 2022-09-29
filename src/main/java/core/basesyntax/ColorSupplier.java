package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 5;
    public String getRandomColor() {
        return Color.values()[COLOR_COUNT].name();
    }
}
