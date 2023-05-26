package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(DifColors.values().length);
        return DifColors.values()[index].toString();
    }
}
