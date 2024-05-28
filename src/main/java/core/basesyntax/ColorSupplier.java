package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        Random colorRandom = new Random();
        int result = colorRandom.nextInt(Colors.values().length);
        return Colors.values()[result];
    }
}
