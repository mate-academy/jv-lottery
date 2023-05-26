package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_SIZE = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int position = random.nextInt(COLOR_SIZE);
        return Color.values()[position].name();
    }
}
