package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index;
    private Color color;

    public String getRandomColor() {
        index = new Random().nextInt(Color.values().length);
        color = Color.values()[index];
        return color.name();
    }
}
