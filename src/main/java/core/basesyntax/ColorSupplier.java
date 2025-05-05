package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        Color color = colors[random.nextInt(Color.values().length)];
        return color.name();
    }
}
