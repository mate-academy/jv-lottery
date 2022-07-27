package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random(Colors.values().length);
        return Colors.values()[random.nextInt()].toString();
    }
}
