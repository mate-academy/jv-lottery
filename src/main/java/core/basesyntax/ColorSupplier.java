package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random rand = new Random();
        int index = rand.nextInt(Colors.values().length);
        return Colors.values()[index].toString();
    }
}
