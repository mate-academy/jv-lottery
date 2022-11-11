package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLORS_COUNT = new Random().nextInt(Colors.values().length);

    public String getRandomColor() {
        return Colors.values()[COLORS_COUNT].name();
    }
}
