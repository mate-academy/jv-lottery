package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] values = Color.values();
        int randInt = new Random().nextInt(values.length);
        String randColor = String.valueOf(values[randInt]);
        return randColor;
    }
}
