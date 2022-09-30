package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(ColorList.Color.values().length);
        return ColorList.Color.values()[index].name();
    }
}
