package core.basesyntax;

import java.util.Random;

class ColorSupplier {

    public Colors getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index];
    }
}
