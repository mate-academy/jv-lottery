package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public StartColors getRandomColor() {
        int index = new Random().nextInt(StartColors.values().length);
        return StartColors.values()[index];
    }
}
