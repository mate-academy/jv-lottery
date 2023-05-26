package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int index = new Random().nextInt(DifferentColor.values().length);
        return String.valueOf(DifferentColor.values()[index]);
    }
}
