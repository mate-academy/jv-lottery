package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();

    public String getRandomColor() {
        int randomNumberForColor = random.nextInt(Colors.values().length);
        return Colors.values()[randomNumberForColor].toString();
    }
}
