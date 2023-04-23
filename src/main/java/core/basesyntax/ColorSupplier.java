package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(ColoursDifferent.values().length);
        return ColoursDifferent.values()[index].name();

    }
}
