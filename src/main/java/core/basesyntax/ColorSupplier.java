package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index];
    }

    public int getNumber() {
        Random random = new Random();
        int value = random.nextInt(100);
        return value;
    }
}
