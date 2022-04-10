package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public colors getRandomColor() {
        int index = new Random().nextInt(colors.values().length);
        return colors.values()[index];
    }

}
