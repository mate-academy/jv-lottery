package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(RandomColor.values().length);
        return RandomColor.values()[index].toString();
    }
}
