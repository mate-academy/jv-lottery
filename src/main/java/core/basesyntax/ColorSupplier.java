package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomColorNumber = new Random().nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[randomColorNumber]);
    }
}
