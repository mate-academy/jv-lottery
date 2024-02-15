package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random randomint = new Random();
        int index = randomint.nextInt(Colors.values().length);
        return Colors.values()[index].toString();
    }
}
