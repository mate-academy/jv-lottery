package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] colors = Color.values();
        Color color = colors[new Random().nextInt(colors.length)];
        return color.toString();
    }
}
