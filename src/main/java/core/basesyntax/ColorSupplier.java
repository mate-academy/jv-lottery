package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        int index = RANDOM.nextInt(COLORS.length);
        Color color = COLORS[index];
        return color.toString();
    }
}
