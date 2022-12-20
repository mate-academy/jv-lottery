package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        int indexColor = new Random().nextInt(Colors.values().length);
        return Colors.values()[indexColor];
    }
}
