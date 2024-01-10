package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int indexColor = new Random().nextInt(DifferentColors.values().length);
        return DifferentColors.values()[indexColor].toString();
    }
}
