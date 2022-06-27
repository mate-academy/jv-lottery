package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[index]);
    }
}
