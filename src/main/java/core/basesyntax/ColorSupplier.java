package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Random randomInt = new Random();

    public String getRandomColor() {
        return Color.values()[randomInt.nextInt(Color.values().length)].toString();
    }
}
