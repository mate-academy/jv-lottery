package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] colors = Color.values();

    public String getRandomColor() {
        return colors[new Random().nextInt(colors.length)].toString();
    }
}
