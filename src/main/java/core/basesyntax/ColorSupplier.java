package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        final int Index = new Random().nextInt(Color.values().length);
        return Color.values()[Index].name();
    }
}
