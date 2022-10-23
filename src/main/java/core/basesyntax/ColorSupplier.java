package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Colours getRandomColor() {
        int pick = new Random().nextInt(Colours.values().length);
        return Colours.values()[pick];
    }
}
