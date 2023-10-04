package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random rand = new Random();
        return Colors.values()[rand.nextInt(Colors.values().length)].toString();
    }
}
