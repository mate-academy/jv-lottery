package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomPosition = new Random().nextInt(Colors.values().length);
        return Colors.values()[randomPosition].toString();
    }
}
