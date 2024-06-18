package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] colors = Color.values();

    public String getRandomColor() {
        int index = new Random().nextInt(colors.length);
        return colors[index].name().toLowerCase();
    }
}
