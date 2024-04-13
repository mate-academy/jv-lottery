package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    int index = new Random().nextInt(Color.values().length);
    final String getRandomColor() {
        return Color.values()[index].name();
    }
}
