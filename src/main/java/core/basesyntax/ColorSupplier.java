package core.basesyntax;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] values = Color.values();
        return values[new Random().nextInt(values.length)].name();
    }
}
