package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    int index;

    public String getRandomColor() {
        index = random.nextInt(Colors.values().length);
        Colors colors = Colors.values()[index];
        return colors.toString();
    }
}
