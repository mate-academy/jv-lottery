package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static ColorBol getRandomColor() {
        int index = new Random().nextInt(ColorBol.values().length);
        String color = String.valueOf(ColorBol.values()[index]);
        return ColorBol.valueOf(color);
    }
}
