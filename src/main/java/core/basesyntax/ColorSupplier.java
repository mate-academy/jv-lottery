package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Colors[] colors = Colors.values();
    private final Random random = new Random();

    public String getRandomColor() {
        Colors randColor = colors[random.nextInt(colors.length)];
        return colors[random.nextInt(colors.length)].name();
    }
}
