package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static String getRandomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)].toString();
    }
}
