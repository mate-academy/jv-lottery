package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int INDEX_OF_COLORS = new Random().nextInt(Colors.values().length);

    public String getRandomColor() {
        return "" + Colors.values()[INDEX_OF_COLORS];
    }
}
