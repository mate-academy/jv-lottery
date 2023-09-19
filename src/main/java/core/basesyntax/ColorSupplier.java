package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(AllColors.values().length);
        return String.valueOf(AllColors.values()[index]);
    }
}
