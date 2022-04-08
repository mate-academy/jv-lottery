package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Colors {White, Yellow, Orange, Red, Magenta, Green, Blue, Pink, Black}

    public static String getRandomColor() {
        Random random = new Random();
        return Colors.values()[random.nextInt(Colors.values().length)].toString();
    }
}
