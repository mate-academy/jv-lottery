package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    int index = new Random().nextInt(Colors.values().length);

    public String getRandomColor() {
        Colors colors = Colors.values()[index];
        return colors.toString();
    }
}
