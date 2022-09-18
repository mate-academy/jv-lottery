package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        Random randomColor = new Random();
        return Colors.values()[index];
    }
}

