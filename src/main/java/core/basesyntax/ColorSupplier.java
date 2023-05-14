package core.basesyntax;

import java.util.Random;
import java.util.concurrent.Callable;

public class ColorSupplier {
    public Colors getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return color;
    }
}
