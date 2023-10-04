package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] colors = Color.values();
    private final Random random = new Random();

    public String getRandomColor() {
        Color randColor = colors[random.nextInt(colors.length)];
        return randColor.toString();
    }
}
