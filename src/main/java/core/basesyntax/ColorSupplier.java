package core.basesyntax;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
