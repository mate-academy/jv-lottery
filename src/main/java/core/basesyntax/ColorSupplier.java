package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int indexColor = new Random().nextInt(Color.values().length);
        return String.valueOf(Color.values()[indexColor]);
    }
}
