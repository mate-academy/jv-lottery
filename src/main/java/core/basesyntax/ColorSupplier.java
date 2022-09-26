package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return String.valueOf(ColorsList.values()[new Random()
               .nextInt(ColorsList.values().length)]);
    }
}
