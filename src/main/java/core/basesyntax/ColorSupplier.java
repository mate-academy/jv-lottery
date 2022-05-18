package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    static final int COLORS_AMOUNT = Colors.values().length;

    public String getRandomColor() {
        int index = new Random().nextInt(COLORS_AMOUNT);
        return Colors.values()[index].toString();
    }
}
