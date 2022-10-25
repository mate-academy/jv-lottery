package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colours getRandomColor() {
        int pick = new Random().nextInt(Colours.values().length);
        return Colours.values()[pick];
    }
}
