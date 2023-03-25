package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    static private int index;
    public String getRandomColor() {
        index = new Random().nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
