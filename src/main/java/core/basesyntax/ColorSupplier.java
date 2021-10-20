package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colours getRandomColor() {
        return Colours.values()[new Random().nextInt(Colours.values().length)];
    }
}
