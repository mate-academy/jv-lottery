package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLOR = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[NUMBER_OF_COLOR].toString();
    }
}
