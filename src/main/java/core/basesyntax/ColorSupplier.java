package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return Colors.values() [new Random().nextInt(5)].toString();
    }
}
