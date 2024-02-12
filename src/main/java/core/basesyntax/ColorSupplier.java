package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_QUANTITY = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(COLOR_QUANTITY);
        return String.valueOf(Color.values()[randomIndex]);
    }
}
