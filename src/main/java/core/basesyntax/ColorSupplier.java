package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Colors[] COLORS = Colors.values();
    private static final Random random = new Random();
    private final String randomColor;

    public ColorSupplier() {
        this.randomColor = getRandomColor();
    }

    public String getRandomColor() {
        Colors randomColor = COLORS[random.nextInt(COLORS.length)];
        return randomColor.name();
    }
}
