package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(ColorsEnum.values().length);
        return ColorsEnum.values()[index].toString();
    }
}
