package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Color[] values = Color.values();
    int index = new Random().nextInt(values.length);
    public String getRandomColor() {
        return Color.values()[index].toString();
    }
}
