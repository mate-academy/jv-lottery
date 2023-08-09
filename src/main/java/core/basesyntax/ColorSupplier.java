package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        return Colors.values()[random.nextInt(Colors.values().length)].toString();

    }
}
