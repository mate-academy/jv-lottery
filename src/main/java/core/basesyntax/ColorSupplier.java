package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int randomNumberForColor = random.nextInt(Colors.values().length);
        return Colors.values()[randomNumberForColor].toString();
    }
}
