package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colours getRandomColor() {
        int index = new Random().nextInt(Colours.values().length);
        return Colours.values()[index];
    }
}
