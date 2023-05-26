package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static int index;

    public String getRandomColor() {
        index = new Random().nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
