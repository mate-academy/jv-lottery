package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static int index;

    static String getRandomColor() {
        index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index].name();
    }
}
