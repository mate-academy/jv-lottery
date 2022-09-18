package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public DifferentcColors getRandomColor() {
        int index = new Random().nextInt(DifferentcColors.values().length);
        return DifferentcColors.values()[index];
    }
}
