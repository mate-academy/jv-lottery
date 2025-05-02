package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomColorIndex = new Random().nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[randomColorIndex]);
    }
}
