package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Colors {
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
