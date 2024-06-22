package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] ALL_COLORS = Color.values();
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(ALL_COLORS.length);
        Color color = ALL_COLORS[index];
        return color.name();
    }
}
