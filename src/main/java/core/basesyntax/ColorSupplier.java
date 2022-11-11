package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color [] COLORS = Color.values();
    private Random random;

    public String getRandomColor() {
        random = new Random();
        return COLORS[random.nextInt(COLORS.length)].name();
    }
}
