package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball {

    public String getRandomColor() {
        int index = new Random().nextInt(ColorList.values().length);
        ColorList randomColor = ColorList.values()[index];

        return randomColor.name();
    }
}
