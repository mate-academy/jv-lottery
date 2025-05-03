package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        int i = random.nextInt(Colors.values().length);
        return Colors.values()[i].name();
    }
}
