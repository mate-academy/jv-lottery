package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public Colours getRandomColor() {
        int i = new Random().nextInt(Colours.values().length);
        return Colours.values()[i];
    }
}
