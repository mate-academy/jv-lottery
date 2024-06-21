package core.basesyntax;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private final int index = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[index].name();
    }
}
