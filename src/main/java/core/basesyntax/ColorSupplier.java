package core.basesyntax;

import java.util.Random;


public class ColorSupplier {
    public Colors getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return color;
    }
}
