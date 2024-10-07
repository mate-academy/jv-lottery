package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random rand = new Random();

    public String getRandomColor() {

        return Colors.values()[rand.nextInt(Colors.values().length)].toString();
    }
}
