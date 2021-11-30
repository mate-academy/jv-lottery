package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public DifColors getRandomColor() {
        int index = new Random().nextInt(DifColors.values().length);
        return DifColors.values()[index];
    }
}
