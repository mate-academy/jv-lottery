package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colour getRandomColor() {
        return Colour.values()[new Random().nextInt(Colour.values().length)];
    }
}
