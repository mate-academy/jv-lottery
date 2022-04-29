package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random randomInt = new Random();

    public String getRandomColor() {
        return Color.values()[randomInt.nextInt(Color.values().length)].toString();
    }
}
