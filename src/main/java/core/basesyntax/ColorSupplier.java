package core.basesyntax;

import java.util.Random;

import static core.basesyntax.Colours.valueOf;

public class ColorSupplier {
    public Colours getRandomColor() {
     return Colours.values()[new Random().nextInt(Colours.values().length)];
    }
}
