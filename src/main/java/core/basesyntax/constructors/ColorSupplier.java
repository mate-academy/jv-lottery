package core.basesyntax.constructors;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return Colors.values()[new
              Random().nextInt(Colors.values().length)].name();
    }
}
