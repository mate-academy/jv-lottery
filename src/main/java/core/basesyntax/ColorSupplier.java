package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor(Random randomNumber) {
        return Colors.values()[randomNumber.nextInt(Colors.values().length)].toString();
    }
}
