package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int pick = new Random().nextInt(Colors.values().length);
        return Colors.values()[pick].name();
    }
}
