package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        int pickColor = new Random().nextInt(Colors.values().length);
        return Colors.values()[pickColor];
    }
}


