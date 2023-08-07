package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_QUANTITY = Color.values().length;

    public String getRandomColor() {
        int randomIndex = new Random().nextInt(COLOR_QUANTITY);
        return String.valueOf(Color.values()[randomIndex]);
    }
}
