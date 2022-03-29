package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        return ColorList.values()[random.nextInt(ColorList.values().length)].toString();
    }
}
