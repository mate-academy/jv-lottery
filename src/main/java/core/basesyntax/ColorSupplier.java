package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color color = Color.values()[new Random().nextInt(Color.values().length)];

    public String getRandomColor() {
        return color.name();
    }
}
