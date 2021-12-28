package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[index]);
    }
}