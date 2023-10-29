package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private Random random = new Random();

    public String getRandomColor() {
        int colorInt = random.nextInt(COLORS.length);
        return COLORS[colorInt].name();
    }
}
