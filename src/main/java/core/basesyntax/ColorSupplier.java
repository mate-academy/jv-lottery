package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 5;
    private Random random = new Random();

    public String getRandomColor() {
        int randomColorIndex = random.nextInt(COLOR_COUNT);
        return Color.values()[randomColorIndex].name();
    }
}
