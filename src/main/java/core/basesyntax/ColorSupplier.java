package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomColors = new Random().nextInt(Colors.values().length);
        return Colors.values()[randomColors].toString();
    }
}
