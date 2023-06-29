package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int i = new Random().nextInt(Color.values().length);
        return String.valueOf(Color.values()[i]);
    }
}
