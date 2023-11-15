package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    static final int valueOfEnumColors = 5;
    private final Random random = new Random();

    public String getRandomColor() {
        Colors[] colors = Colors.values();
        Colors color = colors[random.nextInt(valueOfEnumColors)];
        return color.name();
    }
}
