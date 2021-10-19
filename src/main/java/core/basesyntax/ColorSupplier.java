package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int i = new Random().nextInt(ColorList.values().length);
        return ColorList.values()[i].toString();
    }
}
