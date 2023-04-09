package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(DifferentColor.values().length);
        return DifferentColor.values()[index].toString();
    }
}
