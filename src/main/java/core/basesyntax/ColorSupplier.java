package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        String colorName = Color.values()[index].name();
        return colorName;
    }
}
