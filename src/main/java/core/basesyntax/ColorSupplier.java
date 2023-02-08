package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomIndexColor = new Random().nextInt(Colors.values().length);
        return Colors.values()[randomIndexColor].name();
    }
}
