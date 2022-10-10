package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static ENUMdifferenColor getRandomColor() {
        int index = new Random().nextInt(ENUMdifferenColor.values().length);
        return ENUMdifferenColor.values()[index];
    }
}
